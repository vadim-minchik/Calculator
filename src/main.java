import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		InputVariablesLogics inputVariablesLogics = new InputVariablesLogics();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ведите операцию что вы хотите сделать");
		String action = scanner.nextLine();
		
		inputVariablesLogics.methodSumNumbers(action);
		
	}

}
