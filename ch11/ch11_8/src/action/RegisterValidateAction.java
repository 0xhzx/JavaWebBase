package action;

import java.util.regex.Pattern;

import bean.User;
import bean.UserDbase;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterValidateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	private String userPwd;

	public String register() throws Exception {
		UserDbase ud = new UserDbase();
		if (ud.addUser(user) == 1)
			return "success";
		return "error";
	}

	@Override
	public void validate() {
		if(user.getUserName() == null || user.getUserName().length() <= 0) {
			addFieldError("user.userName", "�û�������Ϊ�գ�");
		} else {
			String f1 = "[a-zA-Z]\\w*";
			if(!Pattern.matches(f1, user.getUserName())) {
				addFieldError("user.userName", "�û�����ʽ����ȷ��");
			}
		}
		if(user.getUserPwd() == null || user.getUserPwd().length() <= 0) {
			addFieldError("user.userPwd", "���벻��Ϊ�գ�");
		} else {
			if(user.getUserPwd().length() < 6) {
				addFieldError("user.userPwd", "���볤�Ȳ���С��6��");
			}
		}
		if(userPwd == null || userPwd.length() <= 0) {
			addFieldError("userPwd", "ȷ�����벻��Ϊ�գ�");
		} else {
			if(!userPwd.equals(user.getUserPwd())) {
				addFieldError("userPwd", "���벻һ�£�");
			}
		}
		if(user.getUserEmail() == null || user.getUserEmail().length() <= 0) {
			addFieldError("user.userEmail", "�ʼ���ַ����Ϊ�գ�");
		} else {
			String f2 = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*.\\w+([-.]\\w+)*";
			if(!Pattern.matches(f2, user.getUserEmail())) {
				addFieldError("user.userEmail", "�����ַ��ʽ����ȷ��");
			}
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
