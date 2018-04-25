import java.util.Scanner;

public class Switch {
	public static void main(String[] args){
		float value1;
		float value2;
		String Operation;
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter a first value:");
		value1=value.nextInt();
		System.out.println("Enter a second value:");
		value2=value.nextInt();
	
		Scanner op = new Scanner(System.in);
		
		System.out.println("Enter your operation:");
		Operation= op.next();

		float add= value1 + value2;
		float sub= value1 - value2;
		float mul= value1 * value2;
		float div= value1 / value2;
		
		switch(Operation)
		{
		case "+":
		{
			System.out.println("The addition of given value is:"+(add));
		}
		case "-":
		{
			System.out.println("The subtraction of given value is:"+(sub));
		}
		case "*":
		{
			System.out.println("The multiplication of given value is:"+(mul));
		}
		case "/":
		{
			System.out.println("The division of given value is:"+(div));
		}
			
		}
	}
}
