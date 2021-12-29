package week.day2homework;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] data = {23,45,67,32,89,22};	
		
		Arrays.sort(data);
		int secondSmallest=data[1];
		System.out.println(secondSmallest);
		
	}

}
