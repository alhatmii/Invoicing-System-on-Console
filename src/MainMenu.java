import java.util.Scanner;

public class MainMenu {

//	Put the Menu as static to remain exist in memory:
	private static void printMainMenu() {
		System.out.println("Application Main Menu: \r");
		System.out.println("1. Shop Settings");
		System.out.println("2. Manage Shop Items");
		System.out.println("3. Create New Invoice");
		System.out.println("4. Report: Statistics");
		System.out.println("5. Report: All Invoices");
		System.out.println("6. Search (1) Invoice");
		System.out.println("7. Program Statistics");
		System.out.println("8. Exit \r");
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
				boolean i = true;
				while (i) {
					System.out.println("1. Load Data (Items and invoices)");
					System.out.println("2. Set Shop Name (data should be saved)");
					System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website) (Data should be saved)");
					System.out.println("4. Go Back");

					int InnerChoice1 = sc.nextInt();

					if (InnerChoice1 == 1) {

					}

					else if (InnerChoice1 == 2) {

					}

					else if (InnerChoice1 == 3) {

					}

//					Exiting the menu:
					else if (InnerChoice1 == 4) {
						i = false;
					}
				}
				break;
			case 2:
				boolean k = true;
				while (k) {
					System.out.println("1. Add Items (Item should be saved/serialized)");
					System.out.println("2. Delete Items");
					System.out.println("3. Change Item Price");
					System.out.println("4. Report All Items");
					System.out.println("5. Go Back");

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
						i = false;
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
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}