package PolyMorphisam;

public class CompiletimePolyMorphisam {

	public class Calculator {
		// Method to add two integers
		public int add(int a, int b) {
			return a + b;
		}

		// Method to add three integers
		public int add(int a, int b, int c) {
			return a + b + c;
		}

		// Method to add two double numbers
		public double add(double a, double b) {
			return a + b;
		}

		// Method two strings
		public String add(String str1, String str2) {
			return str1 + str2;
		}

		// Method to add an array of integers
		public int add(int[] numbers) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			return sum;
		}

		// ... You can define more overloaded methods based on different parameter types
	}

}
