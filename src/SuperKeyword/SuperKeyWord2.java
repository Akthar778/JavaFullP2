package SuperKeyword;

public class SuperKeyWord2 extends SuperKeyWord {
	void m1() {
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		SuperKeyWord2 obj = new SuperKeyWord2();
		obj.m1();
	}
}
