import java.util.ArrayList;
import java.util.List;
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
		Shop Sp = new Shop();
		List<Shop> newShopName = new ArrayList<Shop>();

//		User Input for Shop name:;
		System.out.println("What is Shop Name?");
		String iId = sc.next();
		Sp.setShopName(iId);

		List<Shop> newShopLoc = new ArrayList<Shop>();

//		User Input for Shop name:;
		System.out.println("Where does Shop Located?");
		String iId1 = sc.next();
		Sp.setShopLocation(iId1);
		newShopName.add(Sp);

	}
}