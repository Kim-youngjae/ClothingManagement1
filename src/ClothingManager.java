import java.util.Scanner;

public class ClothingManager {
	Clothing clothing;
	Scanner input;
	
	ClothingManager(Scanner input) {
		this.input = input;
	}
		
	public void addClothes() {
		clothing = new Clothing();
		System.out.print("�� ������ �����ΰ���? :");
		clothing.name = input.next();
		System.out.print("������ ���Դϱ�? :");
		clothing.whos = input.next();
		System.out.print("��� ������ ������ �� �Դϱ�? :");
		clothing.weather = input.next();
		System.out.print("�� ������ ���� ���� :");
		clothing.warning = input.next();
	}
	public void deleteClothes() {
		System.out.print("�� ������ �����ΰ���? :");
		String clothName = input.next();
		if (clothing == null) {
			System.out.println("the cloth has not been registered");
			return;
		}
		if (clothing.name.equals(clothName)) {
			clothing = null;
			System.out.println("the cloth is deleted.");
		}
	}
	public void editClothes() {
		System.out.print("�� ������ �����ΰ���? :");
		String clothName = input.next();
		if (clothing.name.equals(clothName)) {
			System.out.println("the cloth to be edited is " + clothName);
		}
	}
	public void viewClothes() {
		System.out.print("�� ������ �����ΰ���? :");
		String clothName = input.next();
		if (clothing.name.equals(clothName)) {
			clothing.printInfo();
		}
	}
}
