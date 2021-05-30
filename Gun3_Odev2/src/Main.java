
public class Main 
{

	public static void main(String[] args) 
	{
		Student student = new Student(1,"İsmail Hakkı","Kalyon","ismailkalyon@domain.com",30,"JAVA+REACT");
		Instructor instructor = new Instructor(2,"Engin","Demiroğ","engindemiroğ@domain.com","MCT,PMP");
		
				
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);		
		studentManager.addemail(student);
		studentManager.complete(student);
		studentManager.course(student);
		
		System.out.println("---------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.addemail(instructor);
		instructorManager.certificate(instructor);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}