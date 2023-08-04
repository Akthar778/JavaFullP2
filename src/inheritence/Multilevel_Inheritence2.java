package inheritence;

public class Multilevel_Inheritence2 extends Multilevel_Inheritence {

	public static int C2static = 88;
	String C2nonstatic = "multilevel global string variable";

	public void c2method() {
		System.out.println("this is method in class 2 ");
	}

	public static void main(String[] args) {
		System.out.println(Multilevel_Inheritence.C1static);

		Multilevel_Inheritence obj = new Multilevel_Inheritence();
		obj.c1method();
		System.out.println(obj.c1nonstatic);
	}

}
