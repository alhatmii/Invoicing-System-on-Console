import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

//	Put the Menu as static to remain exist in memory:
	private static void printMainMenu() {
		System.out.println("Application Main Menu: \r");
		System.out.println("1. Shop Settings");
		System.out.println("2. Manage Shop Items");
		System.out.println("3. Create New Invoice (Invoices should be save/serialized)");
		System.out.println("4. Report: Statistics (No Of Items, No of Invoices, Total Sales)");
		System.out.println(
				"5. Report: All Invoices ( Invoice No, Invoice Date, Customer Name, No of items, Total, Balance)");
		System.out.println("6. Search (1) Invoice (Search by Invoice No and Report All Invoice details with items)");
		System.out.println("7. Program Statistics (Print each Main Menu Item with how many number selected).");
		System.out.println("8. Exit. \r");
		System.out.print("Enter your choice: ");
	}

//	The method of implementing the menu in static void:
	public static void main(String[] args) {

		Date date = new Date();

		List<Shop> newShopName = new ArrayList<Shop>();
		List<headerInvice> newHeaderShop = new ArrayList<headerInvice>();
		List<Item> newItem = new ArrayList<Item>();

//		Initiating the Scanner:
		Scanner sc = new Scanner(System.in);

		while (true) {
			printMainMenu();

//			To begin the menu by selecting number:
			int choice = sc.nextInt();
			Item ITM = new Item();

			sc.nextLine();

			switch (choice) {
			case 1:
				boolean a = true;
				while (a) {
					System.out.println("1. Load Existing Invoices & Items.");
					System.out.println("2. Set New Shop Name.");
					System.out.println("3. Set Invoice Header. ");
					System.out.println("4. Go Back");
					System.out.print("Enter your choice: ");

					int InnerChoice1 = sc.nextInt();

					if (InnerChoice1 == 1) {
//						Initiating an object to recall the Method from class Invoice:
						System.out.println("\n");

//						Array of Items Names:
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

//						Array of Items ID:
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

//						Array of Items ID:
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

//						Array of Items ID:
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

//						To repeat the Invoice multiple times with counter:
						for (int i = 0; i < 10; i++) {
							System.out.println("--------------------------------------------------");
							int counter = 0;
							System.out.println("This Item NO: [" + counter + "]");
							System.out.println(
									"The Item Name: " + "(" + ItemName[i] + ") The Item ID: (" + ItemId[i] + ")");
							System.out.println("This item price per Unit: (" + unitPrice[i] + " OMR)");
							System.out.println("We do have in Stock: " + quantity[i] + " Pcs");
							System.out.println("In which this equals in total: " + unitPrice[i] * quantity[i] + " OMR");
							System.out.println("--------------------------------------------------");
							System.out.println("\r");

							counter++;
						}

//						Array of customer first Names:
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

//						Array of customer second Names:
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

//						Array of customer last Names:
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

//						Array of customers Phone Number:
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

//						Array of number Items purchased:
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

//						Array of Total amount:
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

//						Array of Total amount:
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
//						To repeat the Invoice multiple times with counter:
						for (int i = 0; i < 10; i++) {
							System.out.println("--------------------------------------------------");
							int counter = 0;
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

					else if (InnerChoice1 == 2) {
//						Initiating an object to recall the Method from class Shop:
						Shop Sp = new Shop();

//						User Input for Shop name:;
						System.out.println("What is Shop Name?");
						String SN = sc.next();
						Sp.setShopName(SN);
						newShopName.add(Sp);

						List<Shop> newShopLoc = new ArrayList<Shop>();

//						User Input for Shop Location:;
						System.out.println("Where does Shop Located?");
						String SL = sc.next();
						Sp.setShopLocation(SL);
						newShopLoc.add(Sp);

					}

					else if (InnerChoice1 == 3) {
//						Adding Header to the Invoice:
						headerInvice n = new headerInvice();

//						For loop to enter the accuired data:
						boolean T = true;
						while (T) {
//						User Input for Telephone Number:
							System.out.println("What is your Telephone Number?");
							int Tel = sc.nextInt();
							n.setTel(Tel);

//						User Input for Fax Number:
							System.out.println("What is your Fax Number?");
							int Fax = sc.nextInt();
							n.setFax(Fax);

//						User Input for DepEmail Address:
							System.out.println("What is your Email Address?");
							String Email = sc.next();
							n.setEmail(Email);

//						User Input for WebSite:
							System.out.println("What is your WebSite?");
							String WebSite = sc.next();
							n.setWebSite(WebSite);
							newHeaderShop.add(n);

							T = false;
						}
					}

//					Exiting the menu:
					else if (InnerChoice1 == 4) {
						a = false;
					}
				}
				break;
			case 2:
				boolean b = true;
				while (b) {
					System.out.println("1. Add Items (Item should be saved/serialized)");
					System.out.println("2. Delete Items");
					System.out.println("3. Change Item Price");
					System.out.println("4. Report All Items");
					System.out.println("5. Go Back");
					System.out.print("Enter your choice: ");
					System.out.println("\n");

//					Item ITM = new Item();

					int InnerChoice2 = sc.nextInt();

					if (InnerChoice2 == 1) {

						boolean D = true;
						while (D) {

//						User Input for Item name:
							System.out.println("Item Name:");
							String itemName = sc.next();
							ITM.setItemName(itemName);

//						User Input for Item ID:
							System.out.println("Item ID:");
							String itemId = sc.next();
							ITM.setItemId(itemId);

//						User Input for Item Unit Price:
							System.out.println("Unit Price:");
							double itemUnitPrice = sc.nextDouble();
							ITM.setUnitPrice(itemUnitPrice);

//						User Input for Item Unit Price:
							System.out.println("Quantity:");
							int itemQuantity = sc.nextInt();
							ITM.setQuantity(itemQuantity);

//						Adding new Student:
							newItem.add(ITM);
							System.out.println("------------------------------------");
							System.out.println("Do you wish to add new Item?");
							System.out.println("(Answer with yes or no)");
							String AnsS = sc.next();
							System.out.println("------------------------------------");

							if (AnsS.equalsIgnoreCase("yes")) {
								D = true;

							} else if (AnsS.equalsIgnoreCase("no")) {
								System.out.println("Thanks for adding new item details.");
								System.out.println("---------------------------------");
								System.out.println("\n");
								D = false;
							}
						}
					}

					else if (InnerChoice2 == 2) {

//						Print The Items before delete:
						for (Item name : newItem) {
							System.out.println("---------------------------------");
							System.out.println("Name of Item: " + name.getItemName());
							System.out.println("Id of Item: " + name.getItemId());
							System.out.println("Unit Price is: " + name.getUnitPrice());
							System.out.println("Unit Price is: " + name.getQuantity());
							System.out.println("---------------------------------");

						}

						System.out.println("------------------------------------");
						System.out.println("Do you wish to delete an item?");
						System.out.println("(Answer with yes or no)");
						String AnS = sc.next();
						System.out.println("------------------------------------");

						if (AnS.equalsIgnoreCase("yes")) {
						}

						else if (AnS.equalsIgnoreCase("no")) {
							System.out.println("Thank you.");
							System.out.println("---------------------------------");
							System.out.println("\n");
							break;
						}

						System.out.println("Enter name of Item:");
						String ITMS = sc.next();
						System.out.println("Enter item ID to delete:");
						Iterator<Item> iterator = newItem.iterator();
						while (iterator.hasNext()) {
							Item i = iterator.next();
							if (i.getItemName().equals(ITMS)) {
								iterator.remove();
							}
						}
					}

					else if (InnerChoice2 == 3) {
						System.out.println("Enter item ID: ");
						String idOfItem = sc.next();

						for (int i = 0; i < newItem.size(); i++) {
							if (newItem.get(i).getItemId().equalsIgnoreCase(idOfItem)) {

								System.out.println("Item Found Enter New Price: ");
								double priceOfItem = sc.nextDouble();

								newItem.get(i).setUnitPrice(priceOfItem);
								System.out.println("New Item Price Saved");
							}
						}
					}

					else if (InnerChoice2 == 4) {

						System.out.println("\r\n");
						System.out.println(" The Item list is consist of: ");
						for (Item name : newItem) {
							System.out.println("---------------------------------");
							System.out.println("Name of Item: " + name.getItemName());
							System.out.println("Id of Item: " + name.getItemId());
							System.out.println("Unit Price is: " + name.getUnitPrice());
							System.out.println("The total number in stock is: " + name.getQuantity());
							System.out.println("---------------------------------");
						}
						System.out.println("---------------------------------");
						System.out.println("---------------------------------");
					}

//					Exiting the menu:
					else if (InnerChoice2 == 5) {
						b = false;
					}
				}
				break;
			case 3:
				Item ITM1 = new Item();

//				User Input for Item name:
				System.out.println("Item Name:");
				String itemName = sc.next();
				ITM1.setItemName(itemName);

//				User Input for Item ID:
				System.out.println("Item ID:");
				String itemId = sc.next();
				ITM1.setItemId(itemId);

//				User Input for Item Unit Price:
				System.out.println("Unit Price:");
				double itemUnitPrice = sc.nextDouble();
				ITM1.setUnitPrice(itemUnitPrice);

//				User Input for Item Unit Price:
				System.out.println("Quantity:");
				int itemQuantity = sc.nextInt();
				ITM1.setQuantity(itemQuantity);

				System.out.println("INVOICE");
				System.out.println();
				int counter = 0;
				System.out.println("Invoice Number: [0" + counter + "]");
				System.out.println("Invoice Date: " + date);
				System.out.println();
				System.out.println("Billed To:  												Shipping To:");
				System.out.println("John Doe													Jane Doe");
				System.out.println("123 Main St  												456 Park Ave");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Anytown, USA 12345");
				System.out.println();
				System.out.println("Item                                Quantity       Unit Price       Total Price");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Product A                       1                 $10.00            $10.00");
				System.out.println("Product B                       2                 $20.00            $40.00");
				System.out.println("Product C                       3                 $30.00            $90.00");
				System.out.println();
				System.out.println("Subtotal:                                                      $140.00");
				System.out.println("Shipping:                                                       $15.00");
				System.out.println("Tax:                                                            $14.00");
				System.out.println("Total:                                                         $169.00");
				System.out.println();
				System.out.println("Thank you for your business!");

				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:

				boolean c = true;
				while (c) {
					System.out.println("Are you sure you want to exit? (yes/no)");
					System.out.print("Enter your choice: ");

					String exitMenu = sc.next();

					if (exitMenu.equalsIgnoreCase("yes")) {

						System.out.println("Have a Good Day!");
						c = true;

//						To Exit the System:
						System.exit(0);
					}

					else if (exitMenu.equalsIgnoreCase("no")) {
						System.out.println("-------------------------------------------- \r");
						c = false;
					}
				}

				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}