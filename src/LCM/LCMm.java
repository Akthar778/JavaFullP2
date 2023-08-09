package LCM;

public class LCMm {
	public static void main(String[] args) {
		// steps
		// s1 find big number (this step is not needed)
		// s2 use while loop true
		// s3 use if condition by using % (modules) and divided by using modules both
		// its while true loop so we have to break it under while under if break it
		// out of the if add the in lcm ++;
		int n1 = 25;
		int n2 = 30;
		int lcm = 0;
//		if (n1 > n2) {
//			lcm = n1;
//		} else {
//			lcm = n2;
//		}
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("lcm of " + n1 + " and " + n2 + " is = " + lcm);
				break;
			}

			lcm++;
		}
	}
}

class lcm2 {
	public static void main(String[] args) {
		int num = 36;
		int num2 = 17;
		int temp = num;

		while (true) {
			if (temp % num == 0 && temp % num2 == 0) {
				System.out.println("total num lcm of " + temp);
				break;
			}
			temp++;
		}
	}
}
