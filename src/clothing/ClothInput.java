package clothing;

import java.util.Scanner;

import Exceptions.WeatherFormatException;

public interface ClothInput {
	
	public String getName();
	
	public void setName(String name);
	
	public String getWhos();
	
	public void setWhos(String whos);
	
	public String getWeather();
	
	public void setWeather(String weather) throws WeatherFormatException;
	
	public String getWarning();
	
	public void setWarning(String warning);
	
	public void getUserInput(Scanner input);

	public void printInfo();
	
	public void setClothname(Scanner input);
	
	public void setClothWhos(Scanner input);
	
	public void setClothWeather(Scanner input);
	
	public void setClothWarning(Scanner input);
	
}
