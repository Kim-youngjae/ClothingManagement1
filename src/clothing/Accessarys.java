package clothing;

import java.util.Scanner;

public class Accessarys extends Clothing implements ClothInput {
	
	public Accessarys(ClothingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		System.out.print("�Ǽ��縮 ������ �����ΰ���? :");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("���� ������ �Ǽ��縮 �Դϱ�? (Y/N) :");
			answer =input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("������ �Ǽ��縮�Դϱ�? :");
				String whos = input.next();
				this.setWhos(whos);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				System.out.print("������ �Ǽ��縮�Դϱ�? :");
				String whos = input.next();
				this.setWhos(whos);
				break;
			}
			else {
			}
		}
			
		System.out.print("��� ������ ������ �Ǽ��縮 �Դϱ�? :");
		String weather = input.next();
		this.setWeather(weather);
		
		System.out.print("�Ǽ��縮 ������ ���� ���� :");
		String warning = input.next();
		this.setWarning(warning);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Cloth:
			skind = "Cloth";
			break;
		case Accessary:
			skind = "Accessary";
			break;
		case Bag:
			skind = "Bag";
			break;
		case HeadWear:
			skind = "HeadWear";
			break;
		default:
		}
		System.out.println("kind :" + skind + " name: " + this.name + " whos: " + this.whos + " weather: " + this.weather + " warning: " + this.warning);
	}
}
