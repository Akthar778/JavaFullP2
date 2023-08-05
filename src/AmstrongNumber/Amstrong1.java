package AmstrongNumber;

import java.util.Scanner;

public class Amstrong1 {

	public static void main(String[] args) {
		int num = 153, singleLastNumber = 0, EveryNumquib = 0, copyOfNUM = num;

		while (copyOfNUM > 0) {

			singleLastNumber = copyOfNUM % 10;// here we will get last number in num

			EveryNumquib += singleLastNumber * singleLastNumber * singleLastNumber; // here we will quib the number

			copyOfNUM = copyOfNUM / 10;// here we are deleting the last digit
		}
		if (num == EveryNumquib) {
			System.out.println("this is Amstrong Number");
		} else {
			System.out.println("not Amstrong Number");
		}

	}

}

class Amstrong2 {
	public void amstrong(int n) {

		int temp = n, lastDigit, Quib = 0;

		while (temp > 0) {
			lastDigit = temp % 10;
			Quib = Quib + lastDigit * lastDigit * lastDigit;
			temp = temp / 10;

		}
		if (n == Quib) {
			System.out.println("its amstrong");
		} else {
			System.out.println("not Amstrong");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		Amstrong2 obj = new Amstrong2();
		obj.amstrong(n);
	}
}

class Amstrong3 {
	public static void main(String[] args) {
		int originalNumber = 155, temp = originalNumber, lastnumberofOriginalNumber, LastNumQuib = 0;

		while (temp > 0) {
			lastnumberofOriginalNumber = temp % 10;
			LastNumQuib += lastnumberofOriginalNumber * lastnumberofOriginalNumber * lastnumberofOriginalNumber;
			temp /= 10;

		}
		if (LastNumQuib == originalNumber) {
			System.out.println("done");
		} else {
			System.out.println("not amstrong");
		}
	}
}

class amstrong4 {
	public static void main(String[] args) {
		int n = 154, results = 0, temp = n, s = 0;
		while (temp > 0) {
			s = temp % 10;
			results = results + (s * s * s);
			temp = temp / 10;
		}
		if (n == results) {
			System.out.println("okay");
		} else {
			System.out.println("not okay");
		}
	}
}

class amstrong5 {
	void m1(int n) {

		int temp = n, r = 0;

		while (temp > 0) {
			int last = temp % 10;

			r = r + (last * last * last);
			temp /= 10;

		}
		if (r == n) {
			System.out.println("congractulations its prime ");
		} else {
			System.out.println(" not prime number ****");
		}

	}

	public static void main(String[] args) {

		amstrong5 obj = new amstrong5();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number ");
		int n1 = sc.nextInt();
		obj.m1(n1);
	}
}
