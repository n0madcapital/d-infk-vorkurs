import java.util.Scanner;

public class Usprungstring {

	public static void main(String[] args) {
		Scanner nextScan = new Scanner(System.in);
		System.out.println("Enter a string");
		while (true) {
			String firstInput = nextScan.nextLine();
			System.out.println(firstInput.length() > 4 ? firstInput : "Enter a string with at least 5 charachters");
			String realer = firstInput.length() > 4 ? firstInput : "12345";
			String output = "";
			for (int i = 0; i < 3; i++) {
				output = new StringBuilder(output).append(realer.charAt(2*i)).toString();
			}
			System.out.println(output);
		}

	}

}
