
public class Clothing {
	
	String name;
	String whos;
	String weather;
	String warning;
	
	public Clothing() { // �ٵ� �� �̷��� �����ڸ� ��� ����°���? -> �ϳ��� ���� �ȴ� �ٸ� �Ķ���͸� ��� ���� �� ���� ���� ���� ������ó�� ����� �ȴ�.
	}
	
	
	/*public Clothing(String name, String whos) {
		this.name = name;
		this.whos = whos; //this(���� ��ü�� ��� �ǹ̸� ����)�ǹ� �ʵ��� name�� �������� name�� �����ϱ� ����
	}
	
	public Clothing(String name, String whos, String weather, String warning) {
		this.name = name;
		this.whos = whos;
		this.weather = weather;
		this.warning = warning;
	}*/
	
	public void printInfo() { //static�� �޸𸮿� �ٷ� �ö󰡼� ���� ���� �ʿ䰡 ��� ��
		System.out.println("name:" + this.name + "whos" + this.whos + "weather:" + this.weather + "warning:" + this.warning);
	}
	
	/*public void getName(String name){
		this.name = name;
		this.name -> �ʵ� / name -> �Ķ���� / �ʵ�� �Ķ������ ������ ���� ���ƾ� �Ѵ�.
	}*/
	
	
}
// ���� �̰����δ� clothingmanagement�� ������� ���� ������ class �ϳ��� �� �����. -> ������� ���� �� � �������� �������ұ�?

	