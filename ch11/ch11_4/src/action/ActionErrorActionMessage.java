package action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionErrorActionMessage extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		addActionError("ʹ��ActionError��Ӵ�����Ϣ��");
		addActionMessage("ʹ��ActionMessage�����ͨ��Ϣ��");
		return "success";
	}

}
