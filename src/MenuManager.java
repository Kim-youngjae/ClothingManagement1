
import java.util.Scanner;


public class MenuManager {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		ClothingManager clothingManager = new ClothingManager(input); // 왜 위의 문장이랑 자리를 바꾸는거지 굳이?
		int num = 0;
		while (num != 5 /*!num.equals("5")*/) {
			
			showMenu();
			
			num = input.nextInt();
			switch(num) {
			case 1 :
				clothingManager.addClothes();
				break;
			case 2 :
				clothingManager.deleteClothes();
				break;
			case 3 :
				clothingManager.editClothes();
				break;
			case 4 :
				clothingManager.viewClothes();
				break;
				default :
					continue;
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