package entity;

//��ѵ��Ϣ��
public class Train {
	// ��ѵ���
	private String tid;
	// ��ѵ��Ŀ����
	private String name;
	// ��ѵ��ʦ
	private String tutor;
	// ����
	private int count;
	// ��ѵ����
	private String type;

	public Train() {
	}

	public Train(String tid, String name, String tutor, int count, String type) {
		super();
		this.tid = tid;
		this.name = name;
		this.tutor = tutor;
		this.count = count;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Train [tid=" + tid + ", name=" + name + ", tutor=" + tutor
				+ ", count=" + count + ", type=" + type + "]";
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
