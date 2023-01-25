import java.util.Scanner;

public class headerInvice extends Invoice {

	private int Tel;
	private int Fax;
	private String Email;
	private String webSite;

//	Initiating Scanner:
	Scanner sc = new Scanner(System.in);

//	Initiating Arrays 

//	Getter and Setters for properties:
	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public int getFax() {
		return Fax;
	}

	public void setFax(int fax) {
		Fax = fax;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
}
