package max;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Enter 1 to add commodity ...");
		System.out.println("Enter 2 to delete commodity ...");
		System.out.println("Enter 3 to replace commodity ...");
		System.out.println("Enter 4 to for sorting commodity by name... ");
		System.out.println("Enter 5 to for sorting commodity by length ...");
		System.out.println("Enter 6 to for sorting commodity by width ...");
		System.out.println("Enter 7 to for sorting commodity by weight ...");
		System.out.println("Enter 8 to get entered commodity ...");
		System.out.println("Enter 9 to exit !");

	}

	public static void main(String[] args) {
		ArrayList<Commodity> commodityList = new ArrayList<>();

		boolean work = true;
		String[] inputArray = null;
		while (work) {
			menu();
			Scanner sc = new Scanner(System.in);
			String s = "";
			s = sc.nextLine();

			switch (s) {
			case "1":
				System.out.println("Before changes: " + commodityList);
				System.out.println("Enter Commodity: Name Length Width Weight");
				System.out.println("Example: Box 10 10 10");
				s = sc.next();
				inputArray = s.split(" ");
				Commodity.addCommodity(commodityList, inputArray[0], Integer.valueOf(inputArray[1]),
						Integer.valueOf(inputArray[2]), Integer.valueOf(inputArray[3]));
				System.out.println("After changes: " + commodityList);
				break;

			case "2":
				System.out.println("Before changes: " + commodityList);
				System.out.println("Enter Commodity...");
				s = sc.nextLine();
				Commodity.deleteCommodity(commodityList, s);
				System.out.println("After changes: " + commodityList);
				break;

			case "3":
				System.out.println("Before changes: " + commodityList);

				System.out.println("Enter Commodity: OldName New Name Length Width Weight");
				System.out.println("Example: Box NewBox 10 10 10");
				s = sc.next();
				inputArray = s.split(" ");
				Commodity.replaceCommodity(commodityList, inputArray[0], inputArray[1], Integer.valueOf(inputArray[2]),
						Integer.valueOf(inputArray[3]), Integer.valueOf(inputArray[4]));
				System.out.println("After changes: " + commodityList);
				break;

			case "4":
				System.out.println("Before changes: " + commodityList);

				Commodity.sortByName(commodityList);

				System.out.println("After changes: " + commodityList);
				break;

			case "5":
				System.out.println("Before changes: " + commodityList);

				Commodity.sortByLength(commodityList);

				System.out.println("After changes " + commodityList);
				break;

			case "6":
				System.out.println("Before changes: " + commodityList);
				Commodity.sortByWidth(commodityList);
				System.out.println("After changes: " + commodityList);
				break;

			case "7":
				System.out.println("Before changes: " + commodityList);

				Commodity.sortByWeight(commodityList);

				System.out.println("After changes: " + commodityList);
				break;

			case "8":
				System.out.println("Enter name...");
				s = sc.next();

				Commodity.getEnteredCommodity(commodityList, s);

				System.out.println(commodityList);
				break;

			default:
				Commodity.exit();
				break;
			}
		}
	}

}
