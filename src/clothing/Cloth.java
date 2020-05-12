package clothing;

import java.util.Scanner;

public class Cloth extends Clothing {

	public Cloth(ClothingKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setClothname(input);

		setClothWhos(input);

		setClothWeather(input);

		setClothWarning(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind + " name: " + this.name + " whos: " + this.whos + " weather: " + this.weather + " warning: " + this.warning);
	}

}
