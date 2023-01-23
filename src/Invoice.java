import java.util.Date;

public class Invoice {

	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String invoiceDate;
	private int noOfItems;
	private int totalAmount;
	private double paidAmount;
	private double balance;

//	Counter for Invoice Numbers:
	int counter = 0;

//	To Initiate Date in the code:
	Date date = new Date();

//	Initiating an object to object chaining:
	Item item = new Item();

//	Getter and Setters for properties:
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void invoicePaper() {

//		Array of customer first Names:
		String[] FirstName = new String[10];
		FirstName[0] = "Mohammed";
		FirstName[1] = "Ali";
		FirstName[2] = "Cart";
		FirstName[3] = "Dart";
		FirstName[4] = "Electronics";
		FirstName[5] = "Food";
		FirstName[6] = "Golf";
		FirstName[7] = "Horse";
		FirstName[8] = "Dates";
		FirstName[9] = "Rocks";

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

		System.out.println("\n");

//		To repeat the Invoice multiple times with counter:
		for (int i = 1; i <= 11; i++) {
			System.out.println(date);
			System.out.println("Invoice NO: AB000" + counter);
			System.out.println(getFirstName() + " " + getMiddleName() + " " + getLastName());
			System.out.println("Phone Number: " + getPhoneNumber());
			System.out.println("\n");

			counter++;
		}
	}
}