import java.util.Scanner;

public class Exercise07_09 {

	public static double min(double[] array) {

	    double minValue = array[0];

	    for (int i = 0; i < array.length; i++) {

	        if (minValue > array[i]) {
	        	minValue = array[i];
	        }
	    }

	    return minValue;
	}

	public static void main(String[] args) {
		
	    Scanner scnr = new Scanner(System.in);
		final int SIZE = 10;
	    double[] array = new double[SIZE];

	    System.out.print("Enter " + SIZE + " numbers: ");
	    for (int i = 0; i < array.length; i++) {
	    	array[i] = scnr.nextDouble();
	    }

	    System.out.println("The minimum number is: " + min(array));
	    
	    scnr.close();
	    
	    return;
	}
	
}