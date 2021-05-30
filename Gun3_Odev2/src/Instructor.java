
public class Instructor extends User
{
	
	String certificate;

	public Instructor(int userId, String userName, String userSurname, String userEmail, String certificate) 
	{
		super(userId, userName, userSurname, userEmail);
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	

}
