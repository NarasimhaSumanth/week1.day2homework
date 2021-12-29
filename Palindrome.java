package week.day2homework;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343, reversed = 0, temp;
		temp = num;

		for (; num != 0; num /= 10) {
			int rem = num % 10;
			reversed = reversed * 10 + rem;
		}
		if (temp == reversed)

			System.out.println("palindrome");

		else

			System.out.println("not a palindrome");

	}
}
