import java.util.Scanner;

public class notFibbonacci {
    public static void main(String[] args) {
        //Using scanner to ask user for the number of term
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms");
        int terms = scanner.nextInt();

        //Creating the notFib sequence and print it out
        long[] sequence = generateNotFibonacci(terms);
        for (long num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Using a scanner to ask the user the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        //Using checkOutput function to return the position in the array of that number
        int position = checkOutput(number);
        System.out.println("Position: " + position);
    }

    //The method is using loop (iterative) to add terms into an array.
    public static long[] generateNotFibonacci(int terms) {
        //The array that holds all the numbers
        long[] sequence = new long[terms];

        // Base cases
        sequence[0] = 0;
        if (terms > 1) {
            sequence[1] = 1;
        }

        //Looping and using the formula to calculate for the next term based on the previous two terms.
        for (int i = 2; i < terms; i++) {
            sequence[i] = (3 * sequence[i - 1]) + (2 * sequence[i - 2]);
        }

        return sequence;
    }
    //Recursive way to do notFib, I find that it's easier to do #4 recursively.
    public static long notFib(int n) {
        //Base case
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (3 * notFib(n - 1)) + (2 * notFib(n - 2));
        }
    }

    public static int checkOutput(long pos) {
        //the variable i representing is used to iterate through the positions in the NotFibonacci sequence
        int i = 0;
        while (true) {
            //Using the notFib(i) to compute the value at index, and check if that value is > or = to pos
            //if lower than the pos value, then we keep increasing i to check for the next num
            //when it greater or equal than, it returns the i+1 position
            // because positions are 0-based in the sequence.
            if (notFib(i) >= pos) {
                    return i + 1;
            }
            else
                i++;
         }
    }
}



