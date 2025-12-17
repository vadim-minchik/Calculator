import java.util.Scanner;

public class InputVariablesLogics {
	Scanner scanner = new Scanner(System.in);
	
	private static Double result;
	private static String sum = "+";
	private static String minus = "-";
	private static String multiply = "*";
	private static String divide = "/";
	
	public String methodSumNumbers(String newString) {
		if (newString.equals(sum)) {
			
			System.out.println("Введите числа чтоб их сложить ");
			result = CalculatorProcessor.Sum(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println("Сложение  этих чисел: = " + result);
		    
	    } else if (newString.equals(minus)) {
	    	
	    	System.out.println("Введите числа чтоб их отнять ");
	    	result = CalculatorProcessor.Minus(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println("Вычитание этих чисел: = " + result);
		    
	    } else if (newString.equals(multiply)) {
	    	
	    	System.out.println("Введите числа чтоб их умножить ");
	    	result = CalculatorProcessor.multiply(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println("Умножение этих чисел: = " + result);
		    
	    } else if (newString.equals(divide)) {
	    	
	    	System.out.println("Введите числа чтоб их разделить ");
	    	result = CalculatorProcessor.Divide(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println("Деление этих чисел: = " + result);
	    } 
		
		return newString;
		
	}
	
	public String getSum() {
        return sum;
    }
	
	 
}
