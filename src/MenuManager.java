
import java.lang.System.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;


public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		ClothingManager clothingManager = new ClothingManager(input); // 왜 위의 문장이랑 자리를 바꾸는거지 굳이?

		selectMenu(input, clothingManager);
	}

	public static void selectMenu(Scanner input, ClothingManager clothingManager) {
		int num = 0;
		while (num != 5 /*!num.equals("5")*/) {
			try {
				showMenu();

				num = input.nextInt();
				switch(num) {
				case 1 :
					clothingManager.addClothes();
					logger.log("add a cloth");
					break;
				case 2 :
					clothingManager.deleteClothes();
					logger.log("delete a cloth");
					break;
				case 3 :
					clothingManager.editClothes();
					logger.log("edit a cloth");
					break;
				case 4 :
					clothingManager.viewClothes();
					logger.log("view a cloth");
					break;
				default :
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Cloth Management System Menu ***");
		System.out.println("	1. Add Clothes");
		System.out.println("	2. Delete Clothes");
		System.out.println("	3. Edit Clothes");
		System.out.println("	4. View Clothes");
		System.out.println("	5. Exit");
		System.out.println("Select one number between 1-6 :");

	}
}