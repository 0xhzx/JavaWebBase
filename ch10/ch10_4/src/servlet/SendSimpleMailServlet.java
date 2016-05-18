package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendSimpleMailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.163.com");// �������������
		email.setAuthentication("javalesson2011", "java2011");// �����û���������
		try {
			email.addTo(request.getParameter("to"));// �ռ���
			email.setFrom("javalesson2011@163.com");// ������
			email.setSubject(request.getParameter("title"));// �ʼ�����
			email.setMsg(request.getParameter("content"));// �ʼ�����
			email.send();//�����ʼ�
			writer.print("�ʼ����ͳɹ�");
		} catch (EmailException e) {
			e.printStackTrace();
			writer.print("�ʼ�����ʧ��");
		}
	}

}
