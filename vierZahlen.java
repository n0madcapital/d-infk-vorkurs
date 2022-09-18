import java.util.ArrayList;
import java.util.Scanner;

public class vierZahlen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] sarray = {"first", "second", "third", "fourth"};
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (String a : sarray) {
			System.out.println("Enter the " + a + " number!");
			numbers.add(s.hasNextInt() ? s.nextInt() : 0);
			s.nextLine();
		}
		int[] numbersa = numbers.stream().mapToInt(i -> i).toArray();
		int max = Math.max(Math.max(numbersa[0], numbersa[1]), Math.max(numbersa[2], numbersa[3]));
		System.out.println("The biggest number is: " + max);
		s.close();

	}

}
