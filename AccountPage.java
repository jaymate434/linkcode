import java.sql.Date;

public class AccountPage {
	private String account_type;
	private String acc_Fname;
	private String acc_Mname;
	private String acc_Lname;
	private Date DOB;
	private String acc_panid;
	private String martital_status;
	private String Nationality;
	private int income;
	private String F_name;
	private String M_name;
	private String acc_Paddress;
	private String acc_Caddress;
	private String acc_aadharno;
	private String acc_phoneno;
	private String F_phoneno;
	public AccountPage(String account_type, String acc_Fname, String acc_Mname, String acc_Lname, Date dOB,
			String acc_panid, String martital_status, String nationality, int income, String f_name, String m_name,
			String acc_Paddress, String acc_Caddress, String acc_aadharno, String acc_phoneno, String f_phoneno) {
		super();
		this.account_type = account_type;
		this.acc_Fname = acc_Fname;
		this.acc_Mname = acc_Mname;
		this.acc_Lname = acc_Lname;
		DOB = dOB;
		this.acc_panid = acc_panid;
		this.martital_status = martital_status;
		Nationality = nationality;
		this.income = income;
		F_name = f_name;
		M_name = m_name;
		this.acc_Paddress = acc_Paddress;
		this.acc_Caddress = acc_Caddress;
		this.acc_aadharno = acc_aadharno;
		this.acc_phoneno = acc_phoneno;
		F_phoneno = f_phoneno;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAcc_Fname() {
		return acc_Fname;
	}
	public void setAcc_Fname(String acc_Fname) {
		this.acc_Fname = acc_Fname;
	}
	public String getAcc_Mname() {
		return acc_Mname;
	}
	public void setAcc_Mname(String acc_Mname) {
		this.acc_Mname = acc_Mname;
	}
	public String getAcc_Lname() {
		return acc_Lname;
	}
	public void setAcc_Lname(String acc_Lname) {
		this.acc_Lname = acc_Lname;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAcc_panid() {
		return acc_panid;
	}
	public void setAcc_panid(String acc_panid) {
		this.acc_panid = acc_panid;
	}
	public String getMartital_status() {
		return martital_status;
	}
	public void setMartital_status(String martital_status) {
		this.martital_status = martital_status;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public String getM_name() {
		return M_name;
	}
	public void setM_name(String m_name) {
		M_name = m_name;
	}
	public String getAcc_Paddress() {
		return acc_Paddress;
	}
	public void setAcc_Paddress(String acc_Paddress) {
		this.acc_Paddress = acc_Paddress;
	}
	public String getAcc_Caddress() {
		return acc_Caddress;
	}
	public void setAcc_Caddress(String acc_Caddress) {
		this.acc_Caddress = acc_Caddress;
	}
	public String getAcc_aadharno() {
		return acc_aadharno;
	}
	public void setAcc_aadharno(String acc_aadharno) {
		this.acc_aadharno = acc_aadharno;
	}
	public String getAcc_phoneno() {
		return acc_phoneno;
	}
	public void setAcc_phoneno(String acc_phoneno) {
		this.acc_phoneno = acc_phoneno;
	}
	public String getF_phoneno() {
		return F_phoneno;
	}
	public void setF_phoneno(String f_phoneno) {
		F_phoneno = f_phoneno;
	}
	

	
	
	
	
	

}
