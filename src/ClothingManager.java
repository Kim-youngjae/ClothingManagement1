import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clothing.Accessarys;
import clothing.Bags;
import clothing.Cloth;
import clothing.ClothInput;
import clothing.ClothingKind;
import clothing.HeadWears;

public class ClothingManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6682820139565835681L;
	
	ArrayList<ClothInput> clothings = new ArrayList<ClothInput>();
	transient Scanner input;

	ClothingManager(Scanner input) {
		this.input = input;
	}

	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addClothes() {
		int kind = 0;
		ClothInput clothInput;
		while(kind != 1 || kind != 2 || kind != 3 || kind != 3 || kind != 4) {
			try {
				System.out.print("1. For Clothes");
				System.out.print("2. For Accessarys");
				System.out.print("3. For Bags");
				System.out.print("4. For HeadWears");
				System.out.print("종류가 무엇인지 고르세요 1번 ~ 4번 :");
				kind = input.nextInt();
				if (kind == 1) {
					clothInput = new Cloth(ClothingKind.Cloth);
					clothInput.getUserInput(input);
					clothings.add(clothInput);
					break;
				}
				else if (kind == 2) {
					clothInput = new Accessarys(ClothingKind.Accessary);
					clothInput.getUserInput(input);
					clothings.add(clothInput);
					break;
				}
				else if (kind == 3) {
					clothInput = new Bags(ClothingKind.Bag);
					clothInput.getUserInput(input);
					clothings.add(clothInput);
					break;
				}
				else if (kind == 4) {
					clothInput = new HeadWears(ClothingKind.HeadWear);
					clothInput.getUserInput(input);
					clothings.add(clothInput);
					break;
				}
				else {
					System.out.print("종류가 무엇인지 고르세요 1번 ~ 4번 :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 4!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	public void deleteClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		int index = findIndex(clothName);
		removefromClothing(index, clothName);
	}

	public int findIndex(String clothName) {
		int index = -1;
		for (int i = 0; i < clothings.size(); i++) {
			if (clothings.get(i).getName().equals(clothName)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromClothing(int index, String clothName) {

		if (index >= 0) {
			clothings.remove(index);
			System.out.println("the cloth" + clothName + "is deleted");
			return 1;
		}

		else {
			System.out.println("the cloth has not been registered");
			return -1;

		}
	}

	public void editClothes() {
		System.out.print("옷 종류가 무엇인가요? :");
		String clothName = input.next();
		for (int i = 0; i < clothings.size(); i++) {
			ClothInput cloth = clothings.get(i);
			if (cloth.getName().equals(clothName)) {
				int num = 0;
				while (num != 5 /*!num.equals("5")*/) {

					showEditMenu();

					num = input.nextInt();

					switch(num) {
					case 1 :
						cloth.setClothname(input);
						break;
					case 2 :
						cloth.setClothWhos(input);
						break;
					case 3 :
						cloth.setClothWeather(input);
						break;
					case 4 :
						cloth.setClothWarning(input);
						break;
					default :
						continue;
					}
				} //while
				break;
			} //if
		} //for
	}
	public void viewClothes() {
		System.out.println("# of registered clothes" + clothings.size());
		for (int i = 0; i < clothings.size(); i++) {
			clothings.get(i).printInfo();
		}
	}

	public void showEditMenu() {


		System.out.println("** Cloth Info Edit Menu **");
		System.out.println("	1. Edit Clothes");
		System.out.println("	2. Edit Who's");
		System.out.println("	3. Edit Weather");
		System.out.println("	4. Edit Warning");
		System.out.println("	5. Exit");
		System.out.println("Select one number between 1-6 :");

	}
}

