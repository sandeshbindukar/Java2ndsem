import java.util.Scanner;

public class Calculator{
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
		
		if(Operation.equals("+"))
			{
				System.out.println("The addition of given value is:"+(add));
			}
		else if(Operation.equals("-"))
		{
			System.out.println("The subtraction of given value is:"+(sub));
		}
		else if(Operation.equals("*"))
		{
			System.out.println("The multiplication of given value is:"+(mul));
		}
		else if(Operation.equals("/"))
		{
			System.out.println("The division of given value is:"+(div));
		}
		
	}

}
