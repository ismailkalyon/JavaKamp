
public class StudentManager extends UserManager 
{	
	
	public void complete(Student student)
	{
		System.out.println("Kurs %"+student.getComplete()+" tamamland�.");
	}
	
	public void course(Student student)
	{
		System.out.println(student.getCourse()+" kursuna kay�t oldu.");
	}
	
	


}
