package clothing;

import java.util.Scanner;

public class HeadWears extends StuffCloth {
	public HeadWears(ClothingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		setClothname(input);

		setClothWhoswithYN(input);
		
		setClothWeather(input);
		
		setClothWarning(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind + " name: " + this.name + " whos: " + this.whos + " weather: " + this.weather + " warning: " + this.warning);
	}
	
}
