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

//		Initiating the Scanner:
		Scanner sc = new Scanner(System.in);

		while (true) {
			printMainMenu();

//			To begin the menu by selecting number:
			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {
			case 1:
				boolean a = true;
				while (a) {
					System.out.println("1. Load Data (Items and invoices)");
					System.out.println("2. Set Shop Name (data should be saved)");
					System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved)");
					System.out.println("4. Go Back");
					System.out.print("Enter your choice: ");

					int InnerChoice1 = sc.nextInt();

					if (InnerChoice1 == 1) {
//						Initiating an object to recall the Method from class Invoice:
						Invoice inv = new Invoice();
						System.out.println("These are all Invoices loaded from the system:");
						inv.invoicePaper();

//						Initiating an object to recall the Method from class Item:
						Item itm = new Item();
						System.out.println("These are all Items available in the store:");
						itm.loadItems();
					} 

					else if (InnerChoice1 == 2) {
						Shop shop = new Shop();
						shop.addingShop();
						
					}

					else if (InnerChoice1 == 3) {

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

					int InnerChoice2 = sc.nextInt();

					if (InnerChoice2 == 1) {

					}

					else if (InnerChoice2 == 2) {

					}

					else if (InnerChoice2 == 3) {

					}

					else if (InnerChoice2 == 4) {

					}

//					Exiting the menu:
					else if (InnerChoice2 == 5) {
						b = false;
					}

				}
				break;
			case 3:
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