package action;

public class Action {
	private int x, y;
	private int value; // ���ڴ�ż�����
	private String msg; // ���ڴ�ż�����Ϣ

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// ��ͷ���
	public String add() throws Exception {
		value = x + y;
		msg = "��ѡ�����������㣡";
		return "show";
	}

	// ����
	public String sub() throws Exception {
		value = x - y;
		msg = "��ѡ�����������㣡";
		return "show";
	}

	// �������
	public String mul() throws Exception {
		value = x * y;
		msg = "��ѡ�����������㣡";
		return "show";
	}

	// ���̷���
	public String div() throws Exception {
		value = x / y;
		msg = "��ѡ������������㣡";
		return "show";
	}

}
