package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;

public class QueryServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Student> studentlist=new ArrayList<Student>();//��ѯ���
		studentlist.add(new Student("001","����","��"));
		studentlist.add(new Student("002","����","Ů"));
		studentlist.add(new Student("003","����","��"));
		request.setAttribute("result", studentlist);//����ѯ������浽request������
		//ת����show.jsp��ʾ��ѯ���
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
