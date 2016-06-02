package action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import service.UserDao;
import service.impl.UserDaoImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.User;

public class UserAction extends SuperAction implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();

	// �û���¼����
	public String login() {
		UserDao userdao = new UserDaoImpl();
		if (userdao.userLogin(user)) {
			//�����¼�ɹ����û���
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		} else {
			return "login_failure";
		}
	}
	
	@SkipValidation
	//�û�ע������
	public String logout() {
		if(session.getAttribute("loginUserName") != null) {
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	

	@Override
	public void validate() {
		super.validate();
		if("".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "�û�������Ϊ�գ�");
		}
		if(user.getPassword().length() < 6) {
			this.addFieldError("passwordError", "���볤�Ȳ�����6λ��");
		}
	}

	@Override
	public User getModel() {
		return this.user;
	}

}
