package week.day2homework;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			
			int missingnum = i+1;

			if (arr[i]!=missingnum) {

				System.out.println("missing number" + " " + missingnum);
				
				break;

			}

		}
	}

}
