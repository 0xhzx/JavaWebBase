package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormCheckServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		if (!"����".equals(userid)) {
			out.print("�û���������");
		} else {
			String userpwd = request.getParameter("userpwd");
			if (!"".equals(userpwd)) {
				if ("123".equals(userpwd))
					out.print("��ӭ��");
				else
					out.print("�������");
			}

		}
	}

}
