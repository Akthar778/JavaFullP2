package inheritence;

public class Hirarci_Inheritence4 extends Hirarci_Inheritence1 {
	int a = 9000;

	void m1() {
		System.out.println("m1 in Class 4");
	}

	public static void main(String[] args) {
		Hirarci_Inheritence1 obj = new Hirarci_Inheritence1();
		System.out.println(obj.a);

		obj.m1();
	}
}
