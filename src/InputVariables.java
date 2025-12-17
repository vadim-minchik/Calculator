
public class InputVariables {
	
	private static String sum = "+";
	private static String minus = "-";
	private static String multiply = "*";
	private static String divide = "/";

	public static String getAction() {
        return sum;
    }
	
	 public static void setSum(String newSum) {
		 sum = newSum;
	    }
	 
	 public static String getMinus() {
	        return minus;
	    }
	 
	 public static void setMinus(String newMinus) {
		 minus = newMinus;
	    }
	 
	 public static String getMultiply() {
	        return multiply;
	    }
	 
	 public static void setMultiply(String newMultiply) {
		 multiply = newMultiply;
	    }
	 
	 public static String getDivide() {
	        return divide;
	    }
	 
	 public static void setDivide(String newDivide) {
		 divide = newDivide;
	    }
}
