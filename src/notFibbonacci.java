import java.util.Scanner;

public class notFibbonacci {
    public static void main(String[] args) {
        //Use scanner to input how many terms of the notFib should return
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms");
        int terms = scanner.nextInt();
        if (terms <= 0) {
            System.out.println("Need to be greater than 0 to generate.");
            return;
        }
        long[] notFibArray = notFib(terms);

        // Print the array with the sequence
        for (long num : notFibArray) {
            System.out.print(num + ",");
        }

    }


    public static long[] notFib(int terms) {
        long[] sequence = new long[terms];
        // First number always 0 which is our base cases
        sequence[0] = 0;
        if (terms > 1) {
            sequence[1] = 1;
        }

        // Using the formula to generate the next terms iteratively
        // Index i start at 2 because we need to use the base case (sequence 0 and 1 to calculate
        for (int i = 2; i < terms; i++) {
            sequence[i] = (3 * sequence[i - 1]) + (2 * sequence[i - 2]);
        }
        return sequence;
    }
}
