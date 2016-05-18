package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestIp = request.getRemoteAddr();
		String saveDirectory = "d:\\tools\\upload";
		File savedir = new File(saveDirectory);
		if(!savedir.exists()) {
			savedir.mkdirs();
		}
		int maxPostSize = 5 * 1024 * 1024;		//�ϴ���С����Ϊ5M
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		MultipartRequest multipartRequest;
		multipartRequest = new MultipartRequest(request, saveDirectory, maxPostSize, "UTF-8", policy);
		
		Enumeration<String> files = multipartRequest.getFileNames();
		while(files.hasMoreElements()) {
			String name = files.nextElement();
			//System.out.println(name);
			File f = multipartRequest.getFile(name);
			//System.out.println(f.getName());
			if(f != null) {
				String fileName = f.getName();
				File serverFile = new File(saveDirectory + "\\" + requestIp + "-" + fileName);
				//����ǰ�ϴ����ļ�ɾ�����������ܸ�����ǰ�ϴ����ļ�
				if(serverFile.exists()) {
					serverFile.delete();
				}
				f.renameTo(serverFile);
				String message = "�ļ��ϴ��ɹ����ļ���Ϊ�� " + requestIp + "-" + fileName;
				request.setAttribute("message", message);
			}
		}
		request.getRequestDispatcher("upload.jsp").forward(request, response);
	}

}
