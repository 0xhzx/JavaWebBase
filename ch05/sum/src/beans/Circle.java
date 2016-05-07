package beans;

public class Circle {
	private int number;	//Բ�ı��
	private double x;	//Բ��xֵ
	private double y;	//Բ��yֵ
	private double radius;	//�뾶
	private String color;	//������ɫ
	private boolean fill;	//�Ƿ����
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	public Circle() {
	}
	
	public double circleArea() {
		return Math.PI * radius * radius;
	}
	
	public double circleLength() {
		return Math.PI * radius * 2;
	}
	
}
