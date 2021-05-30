
public class UserManager 
{
	public void login(User user)
	{
		System.out.println(user.getUserId()+" Id numaralý "+ user.getUserName() +" "+ user.getUserSurname()+" login oldu.");
	}
	
	public void addemail(User user)
	{
		System.out.println(user.userEmail+" adresi kaydedildi");
	}
	
	
	
	
	
	

}
