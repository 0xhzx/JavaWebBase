package ch08_11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Map<String, String> pm = new HashMap<>();
		pm.put("ɽ��", "����,�ൺ,̩��,Ϋ��,��̨,�ĳ�,��ׯ,����,����,����");
		pm.put("����", "�Ͼ�,����,����,����,��ͨ,���Ƹ�,��,����,����,����");
		pm.put("�㶫", "����,����,�麣,��ͷ,��ɽ,��ݸ,տ��,����,��ɽ,����");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		String s = request.getParameter("proc");
		writer.print(pm.get(s));
	}

}
