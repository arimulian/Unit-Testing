package armul.java.junit;

public class Calculator {

	public int divide(int first, int second) {
		if (second == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}else{
			return (first / second);
		}
	}


	public  int add(int first, int second) {
		return (first + second);
	}
}
