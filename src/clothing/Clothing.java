package clothing;

import java.util.Scanner;

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


	public void setWeather(String weather) {
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
		System.out.print("��� ������ �����մϱ�? :");
		String weather = input.next();
		this.setWeather(weather);
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
