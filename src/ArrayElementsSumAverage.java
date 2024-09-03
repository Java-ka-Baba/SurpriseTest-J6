import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementsSumAverage {
    public static void main(String[] args) {
        // creating instance of Scanner class
        Scanner scanner = new Scanner(System.in);
        //prompting user for size
        System.out.println("Enter the size of an array");
        // storing the user input into size
        int size = scanner.nextInt();
        // declaring array of given size
        int[] array = new int[size];
        // initializing array index's with user input
        for (int index = 0; index < array.length; index++) {
            System.out.println("enter an element");
            array[index] = scanner.nextInt();
        }
        //declaring sum variable to hold sum of array elements
        double sum = 0;
        // iterating over the array for calculating sum
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        //declaring average variable to hold the average of array element
        double average = sum / array.length;
        // printing sum, average, and array
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        //declaring variable minimumDifference to hold the difference of average and
        // initializing it with the difference of average and array's first element
        double minimumDifference = Math.abs(average - array[0]);
        //Calling Math.abs() to get the absolute value
        //declaring minimumDifferenceIndex to store the index of element with the minimumDifference
        int minimumDifferenceIndex = 0;
        // iterating over the array from index 1 to find the index of average's nearest element
        for (int index = 1; index < array.length; index++) {
            double difference = Math.abs(average - array[index]);
            if(minimumDifference > difference){
                minimumDifference = difference;
                minimumDifferenceIndex = index;
            }
        }
        System.out.println("minimumDifferenceIndex = " + minimumDifferenceIndex);
    }
}
