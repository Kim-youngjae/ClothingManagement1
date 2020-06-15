package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;
 

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		ClothingManager clothingManager = getObject("clothingmanager.ser");
		if (clothingManager == null) {
			clothingManager = new ClothingManager(input);
		}
		else {
			clothingManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(clothingManager);
		selectMenu(input, clothingManager);
		
		putObject(clothingManager, "clothingmanager.ser");
		
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
	
	public static ClothingManager getObject(String fileName) {
		ClothingManager clothingManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			clothingManager = (ClothingManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return clothingManager;
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clothingManager;
		
	}

	public static void putObject(ClothingManager clothingManager, String fileName) {

		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(clothingManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}