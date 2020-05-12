package clothing;

import java.util.Scanner;

public abstract class Clothing {

	protected ClothingKind kind = ClothingKind.Cloth;
	protected String name;
	protected String whos;
	protected String weather;
	protected String warning;
	//	protected는 자식 클래스 외에 다른 클래스 혹은 패키지에서는 접근이 불가능한 변수 선언

	public Clothing() { // 근데 왜 이렇게 생성자를 몇개를 만드는거지? -> 하나만 만들어도 된다 다만 파라미터를 몇개를 받을 지 정할 때는 밑의 생성자처럼 만들면 된다.
	}
	
	public Clothing(ClothingKind kind) {
		this.kind = kind;
	}

	public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos; //this(나의 객체의 라는 의미를 가짐)의미 필드의 name과 생성자의 name과 구분하기 위해
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
		this.name -> 필드 / name -> 파라미터 / 필드와 파라미터의 데이터 형은 같아야 한다.
	}*/


}
