
public class login {
	private String Account_no;
	private String user_name;
	private String password;
	public login(String account_no, String user_name, String password) {
		super();
		Account_no = account_no;
		this.user_name = user_name;
		this.password = password;
	}
	public String getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(String account_no) {
		Account_no = account_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
