import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class headerInvice extends Invoice {

	private int Tel;
	private int Fax;
	private String Email;
	private String webSite;

//	Initiating Date:
	Date date = new Date();

//	Initiating Scanner:
	Scanner sc = new Scanner(System.in);

//	Initiating Arrays 
	List<headerInvice> newTel = new ArrayList<headerInvice>();
	List<headerInvice> newFax = new ArrayList<headerInvice>();
	List<headerInvice> newEmail = new ArrayList<headerInvice>();
	List<headerInvice> newWebSite = new ArrayList<headerInvice>();

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

	void Header() {

//		Adding Header to the Invoice:
		headerInvice n = new headerInvice();

//		For loop to enter the accuired data:
		boolean T = true;
		while (T) {
//		User Input for Telephone Number:
			System.out.println("What is your Telephone Number?");
			int Tel = sc.nextInt();
			setTel(Tel);
			newTel.add(n);

//		User Input for Fax Number:
			System.out.println("What is your Fax Number?");
			int Fax = sc.nextInt();
			setFax(Fax);
			newFax.add(n);

//		User Input for DepEmail Address:
			System.out.println("What is your Email Address?");
			String Email = sc.next();
			setEmail(Email);
			newEmail.add(n);

//		User Input for WebSite:
			System.out.println("What is your WebSite?");
			String WebSite = sc.next();
			setWebSite(WebSite);
			newWebSite.add(n);

			T = false;
		}
	}
}
