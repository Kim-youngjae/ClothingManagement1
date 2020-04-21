package clothing;

import java.util.Scanner;

public class Accessarys extends Clothing {

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
				this.setWhos("");
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

}
