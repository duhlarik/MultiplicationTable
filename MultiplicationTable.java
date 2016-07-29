package day7;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("This app will make a multiplication table of the size you choose.");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the number to be multiplied.");
		int multiplied = scan1.nextInt();
		multiplied = multiplied + 1;
		scan1.nextLine();
		System.out.println("Enter the multiplier.");
		int multiplier = scan1.nextInt();
		multiplier = multiplier + 1;
		scan1.nextLine();
		
		int[][] multiplesOf = new int[multiplied][multiplier];
		
		multiplicationTableMaker(multiplied, multiplier, multiplesOf);

		scan1.close();
	}

	public static void multiplicationTableMaker(int multiplied, int multiplier, int[][] multiplesOf) {
		for (int row = 1; row < multiplied; row++) {
			for (int column = 1; column < multiplier; column++) {
				int multiple = row * column;
				multiplesOf[row][column] = multiple;
				System.out.print(multiplesOf[row][column] + "\t");

			}	System.out.println();
		}
	}
}
