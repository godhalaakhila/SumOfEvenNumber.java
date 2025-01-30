public class SumOfEvenNumber {

    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;  // Variable to store the sum of even numbers
        int number = 2;  // Start with the first even number

        // Using a 'while' loop to calculate the sum of even numbers between 1 and 100
        while (number <= 100) {
            sum += number;  // Add the even number to the sum
            number += 2;    // Move to the next even number
        }

        // Print the result
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
 
    

