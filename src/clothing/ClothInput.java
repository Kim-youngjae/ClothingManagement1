package clothing;

import java.util.Scanner;

public interface ClothInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setWhos(String whos);
	
	public void setWeather(String weather);
	
	public void setWarning(String warning);
	
	public void getUserInput(Scanner input);

	public void printInfo();
	
	public void setClothname(Scanner input);
	
	public void setClothWhos(Scanner input);
	
	public void setClothWeather(Scanner input);
	
	public void setClothWarning(Scanner input);
	
}
