import java.util.Scanner;

public class Item {
	private String itemId;
	private String itemName;
	private String unitPrice;
	private int quantity;
	private double qtyPrice;

//	Adding Arrays to save the New added items:

//	Initiating Scanner:
	Scanner sc = new Scanner(System.in);

//	Counter for Invoice Numbers:
	int counter = 0;

//	Getter and Setters for properties:
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
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

}