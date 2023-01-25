import java.util.Scanner;

public class Shop {
	private String shopName;
	private String shopLocation;

//	Initiating the Scanner:
	Scanner sc = new Scanner(System.in);

//	Counter for Invoice Numbers:
	int counter = 0;

//	Getter and Setters for properties:
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopLocation() {
		return shopLocation;
	}

	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}

	void addingShop() {

	}
}