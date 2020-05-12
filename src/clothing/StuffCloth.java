package clothing;

import java.util.Scanner;

public abstract class StuffCloth extends Clothing {

	public StuffCloth(ClothingKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind + " name: " + this.name + " whos: " + this.whos + " weather: " + this.weather + " warning: " + this.warning);
	}

	public void setClothWhoswithYN(Scanner input) {

		char answer = 'x';
		
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("정말 본인의 것 입니까? (Y/N) :");
			answer =input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				setClothWhos(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				setClothWhos(input);
				break;
			}
			else {
			}
		}

	}

}
