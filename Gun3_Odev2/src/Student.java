
public class Student extends User
{
	int complete;
	String course;
	public Student(int userId, String userName, String userSurname, String userEmail, int complete, String course) 
	{
		super(userId, userName, userSurname, userEmail);
		this.complete = complete;
		this.course = course;
	}
	public int getComplete() {
		return complete;
	}
	public void setComplete(int complete) {
		this.complete = complete;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
}
