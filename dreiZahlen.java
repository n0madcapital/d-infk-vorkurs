import java.util.Scanner;
import java.util.ArrayList;

public class dreiZahlen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] sarray = {"first", "second", "third"};
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (String a : sarray) {
			System.out.println("Enter the " + a + " number!");
			numbers.add(s.hasNextInt() ? s.nextInt() : 0);
			s.nextLine();
		}
		int[] numbersa = numbers.stream().mapToInt(i -> i).toArray();
		int max = Math.max(Math.max(numbersa[0], numbersa[1]), numbersa[2]);
		System.out.println(max);
		s.close();
	}
}
