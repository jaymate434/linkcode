
public class Register {
	
	private String Account_Holder_name;
	private String Account_no;
	public static String Ifsc_code;
	public static String Branch_name;
	private int Atm_pin;
	private String user_name;
	private String password;
	private int otp;
	private String email_id;
	private String F_password;
	private String F_username;
	public Register(String account_Holder_name, String account_no, int atm_pin, String user_name, String password, int otp,
			String email_id, String f_password, String f_username) {
		super();
		Account_Holder_name = account_Holder_name;
		Account_no = account_no;
		Atm_pin = atm_pin;
		this.user_name = user_name;
		this.password = password;
		this.otp = otp;
		this.email_id = email_id;
		F_password = f_password;
		F_username = f_username;
	}
	public String getAccount_Holder_name() {
		return Account_Holder_name;
	}
	public void setAccount_Holder_name(String account_Holder_name) {
		Account_Holder_name = account_Holder_name;
	}
	public String getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(String account_no) {
		Account_no = account_no;
	}
	public static String getIfsc_code() {
		return Ifsc_code;
	}
	public static void setIfsc_code(String ifsc_code) {
		Ifsc_code = ifsc_code;
	}
	public static String getBranch_name() {
		return Branch_name;
	}
	public static void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public int getAtm_pin() {
		return Atm_pin;
	}
	public void setAtm_pin(int atm_pin) {
		Atm_pin = atm_pin;
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
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getF_password() {
		return F_password;
	}
	public void setF_password(String f_password) {
		F_password = f_password;
	}
	public String getF_username() {
		return F_username;
	}
	public void setF_username(String f_username) {
		F_username = f_username;
	}
	
	
	

}
