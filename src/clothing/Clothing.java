package clothing;

import java.util.Scanner;

public abstract class Clothing {

	protected ClothingKind kind = ClothingKind.Cloth;
	protected String name;
	protected String whos;
	protected String weather;
	protected String warning;
	//	protected�� �ڽ� Ŭ���� �ܿ� �ٸ� Ŭ���� Ȥ�� ��Ű�������� ������ �Ұ����� ���� ����

	public Clothing() { // �ٵ� �� �̷��� �����ڸ� ��� ����°���? -> �ϳ��� ���� �ȴ� �ٸ� �Ķ���͸� ��� ���� �� ���� ���� ���� ������ó�� ����� �ȴ�.
	}
	
	public Clothing(ClothingKind kind) {
		this.kind = kind;
	}

	public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos; //this(���� ��ü�� ��� �ǹ̸� ����)�ǹ� �ʵ��� name�� �������� name�� �����ϱ� ����
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
	
	/*public void getName(String name){
		this.name = name;
		this.name -> �ʵ� / name -> �Ķ���� / �ʵ�� �Ķ������ ������ ���� ���ƾ� �Ѵ�.
	}*/


}
