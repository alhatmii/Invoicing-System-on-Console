import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {
	private String itemId;
	private String itemName;
	private String unitPrice;
	private int quantity;
	private double qtyPrice;

//	Initiating Scanner:
	Scanner sc = new Scanner(System.in);

//	Counter for Invoice Numbers:
	int counter = 0;

//	Getter and Setters for properties:
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = "fgf1455";
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getQtyPrice() {
		return qtyPrice;
	}

	public void setQtyPrice(double qtyPrice) {
		this.qtyPrice = qtyPrice;
	}

	void loadItems() {
		System.out.println("\n");

//		Array of Items Names:
		String[] ItemName = new String[10];
		ItemName[0] = "Apple";
		ItemName[1] = "Banana";
		ItemName[2] = "Cart";
		ItemName[3] = "Dart";
		ItemName[4] = "Electronics";
		ItemName[5] = "Food";
		ItemName[6] = "Golf";
		ItemName[7] = "Horse";
		ItemName[8] = "Dates";
		ItemName[9] = "Rocks";

//		Array of Items ID:
		String[] ItemId = new String[10];
		ItemId[0] = "A0235";
		ItemId[1] = "B9575";
		ItemId[2] = "C9523";
		ItemId[3] = "D4482";
		ItemId[4] = "E3256";
		ItemId[5] = "F0125";
		ItemId[6] = "G9856";
		ItemId[7] = "H9342";
		ItemId[8] = "D0321";
		ItemId[9] = "R3597";

//		Array of Items ID:
		Double[] unitPrice = new Double[10];
		unitPrice[0] = 3.500;
		unitPrice[1] = 6.500;
		unitPrice[2] = 9.400;
		unitPrice[3] = 200.100;
		unitPrice[4] = 65.300;
		unitPrice[5] = 6.500;
		unitPrice[6] = 69.300;
		unitPrice[7] = 3000.200;
		unitPrice[8] = 362.200;
		unitPrice[9] = 21.200;

//		Array of Items ID:
		int[] quantity = new int[10];
		quantity[0] = 6325;
		quantity[1] = 3325;
		quantity[2] = 5254;
		quantity[3] = 321;
		quantity[4] = 6945;
		quantity[5] = 1250;
		quantity[6] = 1234;
		quantity[7] = 8675;
		quantity[8] = 465;
		quantity[9] = 7554;

//		To repeat the Invoice multiple times with counter:
		for (int i = 0; i < 10; i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("This Item NO: [" + counter + "]");
			System.out.println("The Item Name: " + "(" + ItemName[i] + ") The Item ID: (" + ItemId[i] + ")");
			System.out.println("This item price per Unit: (" + unitPrice[i] + " OMR)");
			System.out.println("We do have in Stock: " + quantity[i] + " Pcs");
			System.out.println("In which this equals in total: " + unitPrice[i] * quantity[i] + " OMR");
			System.out.println("--------------------------------------------------");
			System.out.println("\r");

			counter++;
		}
	}

	void AddItems() {

//		Adding Arrays to save the New added items:
		List<Item> newItem = new ArrayList<Item>();
		List<Item> newItemId = new ArrayList<Item>();
		List<Item> newItemUnitPrice = new ArrayList<Item>();
		List<Item> newItemQuantity = new ArrayList<Item>();

		headerInvice HDI = new headerInvice();
		Item ITM = new Item();

		boolean D = true;
		while (D) {

//				User Input for Item name:
			System.out.println("Item Name:");
			String itemName = sc.next();
			setItemName(itemName);
			newItem.add(ITM);

//				User Input for Item ID:
			System.out.println("Item ID:");
			String itemId = sc.next();
			setItemId(itemId);
			newItem.add(ITM);

//				User Input for Item Unit Price:
			System.out.println("Unit Price:");
			String itemUnitPrice = sc.next();
			setUnitPrice(itemUnitPrice);
			newItem.add(ITM);

//				User Input for Item Unit Price:
			System.out.println("Quantity:");
			int itemQuantity = sc.nextInt();
			setQuantity(itemQuantity);
			newItem.add(ITM);

//				Adding new Student:
			System.out.println("------------------------------------");
			System.out.println("Do you wish to add new Item?");
			System.out.println("(Answer with yes or no)");
			String AnsS = sc.next();
			System.out.println("------------------------------------");

			if (AnsS.equalsIgnoreCase("yes")) {
				D = true;
			}

			else if (AnsS.equalsIgnoreCase("no")) {
				System.out.println("Thanks for adding new item details.");
				System.out.println("--------------------------------------------");
				System.out.println("\n");

				D = false;
				break;
			}
			D = false;
		}
	}
}