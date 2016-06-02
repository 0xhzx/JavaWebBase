package entity;

import java.util.Date;

//Ա����Ϣ��
public class Staff {
	// Ա�����
	private String sid;
	// ����
	private String name;
	// �Ա�
	private String sex;
	// ����
	private String nation;
	// ��������
	private Date birthday;
	// �μӹ���ʱ��
	private Date worktime;
	// ְ��
	private String job;
	// ְ��
	private String level;
	// ���֤��
	private String idCard;
	// ��ַ
	private String address;
	// �ֻ���
	private String phone;

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", name=" + name + ", sex=" + sex
				+ ", nation=" + nation + ", birthday=" + birthday
				+ ", worktime=" + worktime + ", job=" + job + ", level="
				+ level + ", idCard=" + idCard + ", address=" + address
				+ ", phone=" + phone + "]";
	}

	public Staff() {
	}

	public Staff(String sid, String name, String sex, String nation,
			Date birthday, Date worktime, String job, String level,
			String idCard, String address, String phone) {
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.worktime = worktime;
		this.job = job;
		this.level = level;
		this.idCard = idCard;
		this.address = address;
		this.phone = phone;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getWorktime() {
		return worktime;
	}

	public void setWorktime(Date worktime) {
		this.worktime = worktime;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
