package Day19;
import java.util.Scanner;
import java.util.Stack;

public class StackStructure {
	public static void main(String[] args) {

		Stack<String> structure = new Stack<String>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String str = scanner.next();
			structure.add(str);

		}
		for (int i = 0; i <=structure.size()+1; i++) {
			System.out.println(structure.pop());
		}
	}
}
