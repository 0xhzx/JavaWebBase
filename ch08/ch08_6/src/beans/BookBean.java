package beans;

public class BookBean {
	int bookId; // ���
	String bookName; // ����
	String author; // ����
	float price; // �۸�
	String publisher; // ������

	public BookBean() {
		bookId = 1000;
		bookName = "Java Web ����";
		author = "Mary";
		price = 50;
		publisher = "��е��ҵ������";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
