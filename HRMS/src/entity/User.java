package entity;

//�û���Ϣ��
public class User {
	//�û����
	private String uid;
	//�û���
	private String username;
	//����
	private String password;
	//Ȩ��		0��ʾ��ͨ�û���1��ʾ����Ա
	private int authority;
	//Ա�����	���
	private String sid;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password="
				+ password + ", authority=" + authority + ", sid=" + sid + "]";
	}

	public User() {
	}

	public User(String uid, String username, String password, int authority,
			String sid) {
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.authority = authority;
		this.sid = sid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

}
