package clothing;

import java.util.Scanner;

public class Accessarys extends StuffCloth {
	
	public Accessarys(ClothingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		setClothname(input);
		
		setClothWhoswithYN(input);
		
		setClothWeather(input);
		
		setClothWarning(input);
	}	
}
