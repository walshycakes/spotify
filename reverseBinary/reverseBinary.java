import java.util.Scanner;


public class reverseBinary {

	public static void main(String[] args){

		char reversedBinary[];
		Scanner scnr = new Scanner(System.in);

		int input = scnr.nextInt();
		String inputBinary = Integer.toBinaryString(input);
		reversedBinary = new char[inputBinary.length()];
		int length = inputBinary.length();

		for (int i = 0; i < length; ++i){

			reversedBinary[i] = inputBinary.charAt(length -1 -i);

		}

		String reversed = new String(reversedBinary);
		int outputInt = Integer.parseInt(reversed, 2);

		System.out.println(outputInt);

	}

}
