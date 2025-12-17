
import java.util.Scanner;

public class UserData extends InputVariablesLogics {

    private Scanner scanner = new Scanner(System.in);
    private String continueChoice;

    public void cylkUser() {
        while (true) {
            System.out.print("Привет я калькулятор, я могу сделать (+) (-) (*) (/), ведите операцию что вы хотите сделать: ");
            String action = scanner.nextLine();

            methodSumNumbers(action);

            System.out.println("Вы хотите продолжить дальше? (да/нет): ");
            continueChoice = scanner.nextLine();

            if (!continueChoice.equalsIgnoreCase("да")) {
                System.out.println("Завершение работы калькулятора.");
                break; 
            }
        }
    }
}
