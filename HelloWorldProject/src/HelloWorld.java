/*
 * TODO: Justin Wu
 * TODO: 9/17/24
 * TODO: 3
 * TODO: Conversion between binary and decimal numbers
 */
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner input = new Scanner(System.in);
		boolean runAgain = true;
		System.out.print("Welcome!");
		while (runAgain){
			System.out.println("You have the following options");
			System.out.println("1. Binary to Decimal");
			System.out.println("2. Decimal to Binary");
			String conversion = input.nextLine();
			while (!conversion.equals("1") && !conversion.equals("2")){
				System.out.println("Please enter a 1 or a 2");
				conversion = input.nextLine();
			} //end while
	
			if (conversion.equals("1")){
				System.out.println("What is the binary number?");
				String binary = input.nextLine();
				int output = bToD(binary);
				System.out.println("The decimal equivalent is " + output);
			} //end if
			else {
				System.out.println("What is the decimal number?");
				int decimal = input.nextInt();
				String output = dToB(decimal);
				System.out.println("The binary equivalent is " + output);

			}//end else

			System.out.println("Do you want to continue - yes or no?");
			String again = input.nextLine();
			while (!again.toLowerCase().equals("yes") && !again.toLowerCase().equals("no")){
				System.out.println("Please give a 'yes' or 'no'");
				again = input.nextLine();
			}//end while
			if (again.toLowerCase().equals("no"))
				runAgain=false;
			//end if

		}//end while
		
	} //end main

	public static int bToD(String num){
		int result=0;
		int exponent = 0;
		for (int i = num.length()-1; i>=0; i--){
			if (num.charAt(i)=='1')
				result += Math.pow(2,exponent);
			exponent++;
		}//end for
		return result;
	}//end method bToD

	public static String dToB(int num){
		String temp = "";
		String result = "";
		int dec = num;
		while (dec>0){
			temp+=(dec%2);
			dec/=2;
		}//end while

		for (int i=temp.length()-1; i>=0; i--)
			result+=temp.charAt(i);

		return result;
	}//end method
} //end class
