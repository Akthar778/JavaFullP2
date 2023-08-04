package SuperKeyword;

public class ThisAndSuperSameTime2 extends ThisAndSuperSameTime {

	int i = 888;

	void thisMethod() {
		System.out.println(this.i);
	}

	void superMethod() {
		System.out.println(super.i);
	}

	void SuperAndThisMixedInSingleMethod() {
		System.out.println(this.i);
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		ThisAndSuperSameTime2 obj = new ThisAndSuperSameTime2();
		obj.thisMethod();
		obj.superMethod();
		obj.SuperAndThisMixedInSingleMethod();

		// out put
//		888
//		44
//		888
//		44
	}
}
