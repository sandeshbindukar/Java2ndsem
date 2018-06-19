package week9softwareengineering;

public class Question5 {
	public static void main(String[] args) {	
		double[] priceArrays = {4.99, 8.99, 12.50, 15.00, 19.32, 20.89, 17.36, 11.05, 7.39, 5.98 }; 
		double sum = 0;
		double average = 0;
		System.out.println("Sum of all prices");
		for(int i=0; i<priceArrays.length; i++){
			sum += priceArrays[i]; 
		}
		System.out.println("The sum of all price is $ "+sum);
		System.out.println();
		
		System.out.println("Display all values less than $ 5.00");
		for(int i=0; i<priceArrays.length; i++){
			if(priceArrays[i] < 5.00){
				System.out.println("The prices below 5.00 are $ "+priceArrays[i]);
			}
		}
		
		System.out.println();
		System.out.println("Average of the prices");
		average = sum / priceArrays.length;
		System.out.println("The average of all prices is $ "+average);
		System.out.println();
		
		System.out.println("All values higher than the calculated average value");
		for(int i=0; i<priceArrays.length; i++){
			if(priceArrays[i] > average){
				System.out.println("The prices above average are $ "+priceArrays[i]);
			}
		}
	}
}