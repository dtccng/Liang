package Test;

/** Analysis: ... */

/** Design: ... */

/** Coding: Please indent and format your code properly */
/** Copy and paste your code to replace the template below */
/** Note that your class must be named Exercise07_09 */

public class Exercise07_09 {
    public static void main(String[] args) {
        int a = 0;

        /* Scanner used to ask user how many numbers they will be inputting,
        I thought the program was suppose to be used for any amount of numbers
        being imported not just 10
         */

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many numbers are we going through?: ");
        a = input.nextInt();
        System.out.println("");

        // Second Scanner for the numbers imported
        System.out.println("Enter the numbers (with one space in between or hit return/enter in between): ");
        double[] numbers = new double[a];

        // loop through the array
        for (int b = 0; b < numbers.length; b++) {
            numbers[b] = input.nextDouble();
        }

        //Prints the minimum number
        System.out.println("The minimum number is: ");
        System.out.println(+ min(numbers));
    }

    public static double min(double[] array) {

        //declaring min variable
        double min = array[0];
        // loop to check to see if method needs to run
        for (int c = 0; c < array.length; c++) {
            if (min > array[c]) {
                min = array[c]; }}
        return min; }
}