
public class User 
{
	public int userId;
	public String userName;
	public String userSurname;
	public String userEmail;
	
	public User(int userId, String userName, String userSurname, String userEmail) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userEmail = userEmail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}