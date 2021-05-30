
public class StudentManager extends UserManager 
{	
	
	public void complete(Student student)
	{
		System.out.println("Kurs %"+student.getComplete()+" tamamlandı.");
	}
	
	public void course(Student student)
	{
		System.out.println(student.getCourse()+" kursuna kayıt oldu.");
	}
	
	


}
