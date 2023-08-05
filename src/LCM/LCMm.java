package LCM;

public class LCMm {
	public static void main(String[] args) {
		// steps
		// s1 find big number
		// s2 that big number do modules in if loop under while - while(true)
		// s3 out side the if inside the while that bignumber ++ it;
		int n1 = 25;
		int n2 = 30;
		int lcm = 0;
		if (n1 > n2) {
			lcm = n1;
		} else {
			lcm = n2;
		}
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("lcm of " + n1 + " and " + n2 + " is = " + lcm);
				break;
			}

			lcm++;
		}
	}
}
