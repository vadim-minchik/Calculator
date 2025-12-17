import java.util.Scanner;

public class InputVariablesLogics {
	Scanner scanner = new Scanner(System.in);
	
	private static String sum = "+";
	private static String minus = "-";
	private static String multiply = "*";
	private static String divide = "/";

	public String methodSumNumbers(String newString) {
		if (newString.equals(sum)) {
			
			System.out.println("Введите числа чтоб их сложить");
			Double result = CalculatorProcessor.Sum(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println(" = " + result);
		    
	    } else if (newString.equals(minus)) {
	    	
	    	System.out.println("Введите числа чтоб их отнять");
	    	Double result = CalculatorProcessor.Minus(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println(" = " + result);
		    
	    } else if (newString.equals(multiply)) {
	    	
	    	System.out.println("Введите числа чтоб их умножить");
	    	Double result = CalculatorProcessor.multiply(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println(" = " + result);
		    
	    } else if (newString.equals(divide)) {
	    	
	    	System.out.println("Введите числа чтоб их разделить");
	    	Double result = CalculatorProcessor.Divide(scanner.nextDouble(), scanner.nextDouble()); 
		    System.out.println(" = " + result);
		    
	    } else {
	    	
	        return "Неверный оператор";
	        
	    }
		return newString;
	}
	 
}
