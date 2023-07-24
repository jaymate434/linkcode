
public class Documents {
	
	private String pancard;
	private String passport;
	private String driving_licence;
	private String voter_id;
	private String aadhar_card;
	public Documents(String pancard, String passport, String driving_licence, String voter_id, String aadhar_card) {
		super();
		this.pancard = pancard;
		this.passport = passport;
		this.driving_licence = driving_licence;
		this.voter_id = voter_id;
		this.aadhar_card = aadhar_card;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getDriving_licence() {
		return driving_licence;
	}
	public void setDriving_licence(String driving_licence) {
		this.driving_licence = driving_licence;
	}
	public String getVoter_id() {
		return voter_id;
	}
	public void setVoter_id(String voter_id) {
		this.voter_id = voter_id;
	}
	public String getAadhar_card() {
		return aadhar_card;
	}
	public void setAadhar_card(String aadhar_card) {
		this.aadhar_card = aadhar_card;
	}
	

}
