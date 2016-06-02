package entity;

//��ͬ��Ϣ��
public class Contract {
	// ��ͬ���
	private String cid;
	// ��ͬ����
	private String type;
	// ��ͬ����
	private int year;
	// н��
	private float salary;
	// Ա�����	���
	private String sid;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", type=" + type + ", year=" + year
				+ ", salary=" + salary + ", sid=" + sid + "]";
	}

	public Contract() {
	}

	public Contract(String cid, String type, int year, float salary, String sid) {
		this.cid = cid;
		this.type = type;
		this.year = year;
		this.salary = salary;
		this.sid = sid;
	}

}
