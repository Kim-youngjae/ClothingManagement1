package clothing;

import java.util.Scanner;

public class HeadWears extends Clothing {
	public HeadWears(ClothingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		System.out.print("���� ������ �����ΰ���? :");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("���� ������ ���� �Դϱ�? (Y/N) :");
			answer =input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("������ �����Դϱ�? :");
				String whos = input.next();
				this.setWhos(whos);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				System.out.print("������ �����Դϱ�? :");
				String whos = input.next();
				this.setWhos(whos);
				break;
			}
			else {
			}
		}

		System.out.print("��� ������ ������ �����Դϱ�? :");
		String weather = input.next();
		this.setWeather(weather);

		System.out.print("���� ������ ���� ���� :");
		String warning = input.next();
		this.setWarning(warning);
	}

}
