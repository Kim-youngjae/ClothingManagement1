package clothing;

import java.util.Scanner;

import Exceptions.WeatherFormatException;

public abstract class Clothing implements ClothInput {

	protected ClothingKind kind = ClothingKind.Cloth;
	protected String name;
	protected String whos;
	protected String weather;
	protected String warning;
	//	protected�� �ڽ� Ŭ���� �ܿ� �ٸ� Ŭ���� Ȥ�� ��Ű�������� ������ �Ұ����� ���� ����

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

	//	Getters/Setters�� ������ �ؿ� �����ִ� ���� ����
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
		if(weather.contains("�����") || weather.equals("")) {
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
		System.out.print("������ �����ΰ���? :");
		String name = input.next();
		this.setName(name);
	}

	public void setClothWhos(Scanner input) {
		System.out.print("������ ���Դϱ�? :");
		String whos = input.next();
		this.setWhos(whos);
	}

	public void setClothWeather(Scanner input) {
		String weather = "";
		while(!weather.contains("��") && !weather.contains("����") && !weather.contains("����") && !weather.contains("�ܿ�")) {
			System.out.print("��� ������ �����մϱ�? :");
			weather = input.next();
			try {
				this.setWeather(weather);
			} catch (WeatherFormatException e) {
				System.out.println("Incorrect Weather Format, plz type between ��, ����, ����, �ܿ�.");
				System.out.println("if this thing can use for four season, plz type 'fourseason'");
			}
		}
	}

	public void setClothWarning(Scanner input) {
		System.out.print("������ ���� ���� :");
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