package studentAction;
import java.util.List;
import po.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.StudentDao;
public class AddMessageAction extends ActionSupport {
	private Student student;
	public Student getStudent() {return student;}
	public void setStudent(Student student) {this.student = student;}
	public void validate() {
		if (student.getId() == null || student.getId().length() == 0) {
			addFieldError("student.id", "id����Ϊ��!");
		} else {
//			StudentDao dao = new StudentDao();
//			List list = dao.findStudent("id", student.getId());
//			if (!list.isEmpty()) {
//				addFieldError("student.id", " id�����ظ�");
//			}
		}
		if (student.getName() == null || student.getName().length() == 0) {
			addFieldError("student.name", "��������Ϊ��");
		}
		if (student.getAge() > 130) {
			addFieldError("student.age", "����ֵ�Ƿ�");
		}
		if (student.getWeight() > 500) {
			addFieldError("student.weight", "����ֵ�Ƿ� ");
		}
	}
	public String execute() throws Exception {
		StudentDao dao = new StudentDao();
		String message = "input";
		boolean save = dao.saveStudent(student);
		if (save) {
			message = "success";
		}
		return message;
	}
}