package thisKeyWord;

public class thiskeywordPrograme {
	int x = 8; // Global (instance) variable

	public void someMethod() {
		int x = 10; // Local variable with the same name as the global variable

		// Here, x refers to the local variable
		System.out.println("Local x: " + x);

		// To access the global variable, use "this"
		System.out.println("Global x: " + this.x);
	}

	public static void main(String[] args) {
		thiskeywordPrograme obj = new thiskeywordPrograme();
		obj.someMethod();
	}
}

class a {
	// under main method we will not use this key word
	int a = 10;
	String myName = "akthar";

	void b() {
		int a = 20;
		System.out.println(this.a);
		String myName = "Niyaz";
		System.out.println(this.myName);
	}

	public static void main(String[] args) {
		a obj = new a();
		obj.b();
	}
}

class instilizeNonstaticMemberUsingTHIS {
	int i = 0;

	void m1() {
		int i = 20;
		this.i = i;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		instilizeNonstaticMemberUsingTHIS obj = new instilizeNonstaticMemberUsingTHIS();
		obj.m1();
	}
}

class instilizeNonstaticMemberUsingTHISUsingMethods {
	int i = 0;

	void m1(int i) {
		this.i = i;

		System.out.println(this.i);
	}

	public static void main(String[] args) {
		instilizeNonstaticMemberUsingTHISUsingMethods obj = new instilizeNonstaticMemberUsingTHISUsingMethods();

		obj.m1(12);
	}
}

class bothtypes {
	// here we are instializing the nonstatic values in parametor and parametarizes
	// method
	String s1;
	String s2 = "akthar";

	void m1() {
		System.out.println(this.s2);
		bothtypes obj = new bothtypes();
		System.out.println(obj.s2);
	}

	void s1m(String s1) {
		this.s1 = s1;
		System.out.println(this.s1);
	}

	public static void main(String[] args) {
		bothtypes obj = new bothtypes();
		obj.m1();
		obj.s1m("niyaz");
	}
}