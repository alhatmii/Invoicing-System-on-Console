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
		FirstName[2] = "Shaima";
		FirstName[3] = "Fatima";
		FirstName[4] = "Abdulhameed";
		FirstName[5] = "Adnan";
		FirstName[6] = "Malak";
		FirstName[7] = "Aisha";
		FirstName[8] = "Said";
		FirstName[9] = "Sami";

//		Array of customer second Names:
		String[] MiddleName = new String[10];
		MiddleName[0] = "Hisham";
		MiddleName[1] = "Nasser";
		MiddleName[2] = "Ali";
		MiddleName[3] = "Suleiman";
		MiddleName[4] = "Mansoor";
		MiddleName[5] = "Ismail";
		MiddleName[6] = "Ahmed";
		MiddleName[7] = "Mohammed";
		MiddleName[8] = "Abdulaziz";
		MiddleName[9] = "Majid";

//		Array of customer last Names:
		String[] LastName = new String[10];
		LastName[0] = "Khamis";
		LastName[1] = "Mohammed";
		LastName[2] = "Tariq";
		LastName[3] = "Ali";
		LastName[4] = "Said";
		LastName[5] = "Saif";
		LastName[6] = "Mannan";
		LastName[7] = "Sami";
		LastName[8] = "Mohammed";
		LastName[9] = "Talib";

//		Array of customers Phone Number:
		int[] PhoneNumber = new int[10];
		PhoneNumber[0] = 96514485;
		PhoneNumber[1] = 96543325;
		PhoneNumber[2] = 98455254;
		PhoneNumber[3] = 95623321;
		PhoneNumber[4] = 96589945;
		PhoneNumber[5] = 96961250;
		PhoneNumber[6] = 96961234;
		PhoneNumber[7] = 96158675;
		PhoneNumber[8] = 97518465;
		PhoneNumber[9] = 99665588;

//		Array of number Items purchased:
		int[] NoOfItems = new int[10];
		NoOfItems[0] = 5;
		NoOfItems[1] = 9;
		NoOfItems[2] = 6;
		NoOfItems[3] = 2;
		NoOfItems[4] = 3;
		NoOfItems[5] = 1;
		NoOfItems[6] = 7;
		NoOfItems[7] = 5;
		NoOfItems[8] = 8;
		NoOfItems[9] = 7;

//		Array of Total amount:
		double[] totalAmount = new double[10];
		totalAmount[0] = 2.250;
		totalAmount[1] = 9.980;
		totalAmount[2] = 6.990;
		totalAmount[3] = 2.520;
		totalAmount[4] = 3.350;
		totalAmount[5] = 1.120;
		totalAmount[6] = 7.980;
		totalAmount[7] = 5.950;
		totalAmount[8] = 8.750;
		totalAmount[9] = 7.350;

//		Array of Total amount:
		double[] PaidAmount = new double[10];
		PaidAmount[0] = 5;
		PaidAmount[1] = 10;
		PaidAmount[2] = 7;
		PaidAmount[3] = 5;
		PaidAmount[4] = 5;
		PaidAmount[5] = 2;
		PaidAmount[6] = 10;
		PaidAmount[7] = 7;
		PaidAmount[8] = 10;
		PaidAmount[9] = 10;

		double[] Balance = new double[totalAmount.length];

		for (int i = 0; i < totalAmount.length; i++) {
			Balance[i] = PaidAmount[i] - totalAmount[i];
		}

		System.out.println("\n");

//		To repeat the Invoice multiple times with counter:
		for (int i = 0; i < 10; i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("Invoice Number: [0" + counter + "]");
			System.out.println("Issued on: (" + date + ")");
			System.out.println("Invoice NO: 000" + counter + 2 + counter + 5 + counter + 1);
			System.out.println(FirstName[i] + " " + MiddleName[i] + " " + LastName[i]);
			System.out.println("Phone Number: " + PhoneNumber[i]);
			System.out.println("Number of Items Purchased: " + NoOfItems[i]);
			System.out.println("Total Amount: " + totalAmount[i] + " OMR");
			System.out.println("Total Amount Paid: " + PaidAmount[i] + " OMR");
			System.out.println("Remaining Amount: " + Balance[i] + " OMR");
			System.out.println("--------------------------------------------------");
			System.out.println("\n");

			counter++;
		}
	}

	void createInvoice() {

	}
}