package inheritence;

public class singleLevelInheritence2 extends singleLevelInheritence {

	public static void main(String[] args) {
		// this is non static in parent class so we are access with class name
		// without creating object
		System.out.println(singleLevelInheritence.staticnumber);

		// here we are access non static variable so we are crating obj
		// we access are we can edit also
		singleLevelInheritence obj = new singleLevelInheritence();

		System.out.println(obj.i);

		obj.m1();

	}

}
