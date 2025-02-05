package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to go to?");
		int g = in.nextInt();
		int num = 1;
		int [] totalArray = new int [g];
			
		for (int i = 0; i < totalArray.length; i++) {
				totalArray [i] = num;
				num++;
				}
		
		for (int x = 1; x < totalArray.length; x++) {
			if (totalArray[x] != 0) {
			for (int k = x + totalArray[x]; k < totalArray.length; k = k + totalArray[x]) {
				
				totalArray [k] = 0;
		} }
			
		}
		totalArray[0] = 0;
		for (int i = 0; i < totalArray.length; i++) {
			System.out.print(totalArray[i] + " ");
		}
	}
	}



