package inheritence;

public class Hirarci_Inheritence3 extends Hirarci_Inheritence1 {
	int a = 900;

	void m1() {
		System.out.println("m1 in Class 3");
	}

	public static void main(String[] args) {
		Hirarci_Inheritence1 obj = new Hirarci_Inheritence1();
		System.out.println(obj.a);

		obj.m1();
	}

}
