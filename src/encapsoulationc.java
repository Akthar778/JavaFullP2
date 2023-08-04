
public class encapsoulationc {

	public static void main(String[] args) {

		encapsolucation obj = new encapsolucation();
		obj.setakthar(18);
		System.out.println(obj.getakthar());

	}

}

class encapsolucation {

	private int age;

	public void setakthar(int age) {
		this.age = age;
	}

	public int getakthar() {
		return age;
	}

}
