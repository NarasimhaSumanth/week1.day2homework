package week.day2homework;

public class NegativeToPositive {

	public static void negative() {
		int n = -40;

		if (n < 0) {

			int y = (~(n - 1));
			System.out.println("corresponding positive number" + " " + "is:" + " " + y);

		} else {
			System.out.println("Positive number");

		}

	}

	public static void positive() {
		int n = 40;

		if (n < 0) {

			int y = (~(n - 1));
			System.out.println("corresponding positive number" + " " + "is:" + " " + y);

		} else {
			System.out.println("Positive number");

		}
	}

	public static void main(String[] args) {
		
		positive();
		negative();
		
		}

	}

