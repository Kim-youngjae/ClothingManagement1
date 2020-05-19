package clothing;

import java.util.Scanner;

import Exceptions.WeatherFormatException;

public abstract class Clothing implements ClothInput {

	protected ClothingKind kind = ClothingKind.Cloth;
	protected String name;
	protected String whos;
	protected String weather;
	protected String warning;
	//	protected는 자식 클래스 외에 다른 클래스 혹은 패키지에서는 접근이 불가능한 변수 선언

	public Clothing() {
	}

	public Clothing(ClothingKind kind) {
		this.kind = kind;
	}

	public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos;
	}

	public Clothing(ClothingKind kind, String name, String whos, String weather, String warning) {
		this.kind = kind;
		this.name = name;
		this.whos = whos;
		this.weather = weather;
		this.warning = warning;
	}

	//	Getters/Setters는 생성자 밑에 적어주는 것이 좋다
	public ClothingKind getKind() {
		return kind;
	}


	public void setKind(ClothingKind kind) {
		this.kind = kind;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWhos() {
		return whos;
	}


	public void setWhos(String whos) {
		this.whos = whos;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) throws WeatherFormatException {
		if(weather.contains("사계절") || weather.equals("")) {
			throw new WeatherFormatException();
		}
		this.weather = weather;
	}


	public String getWarning() {
		return warning;
	}


	public void setWarning(String warning) {
		this.warning = warning;
	}

	public abstract void printInfo();

	public void setClothname(Scanner input) {
		System.out.print("종류가 무엇인가요? :");
		String name = input.next();
		this.setName(name);
	}

	public void setClothWhos(Scanner input) {
		System.out.print("누구의 것입니까? :");
		String whos = input.next();
		this.setWhos(whos);
	}

	public void setClothWeather(Scanner input) {
		String weather = "";
		while(!weather.contains("봄") && !weather.contains("여름") && !weather.contains("가을") && !weather.contains("겨울")) {
			System.out.print("어느 계절에 적합합니까? :");
			weather = input.next();
			try {
				this.setWeather(weather);
			} catch (WeatherFormatException e) {
				System.out.println("Incorrect Weather Format, plz type between 봄, 여름, 가을, 겨울.");
				System.out.println("if this thing can use for four season, plz type 'fourseason'");
			}
		}
	}

	public void setClothWarning(Scanner input) {
		System.out.print("관리시 주의 사항 :");
		String warning = input.next();
		this.setWarning(warning);
	}

	public String getKindString() {

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

		return skind;	
	}
}