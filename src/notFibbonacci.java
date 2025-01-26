import java.util.Scanner;

public class notFibbonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms");
        int terms = scanner.nextInt();

        long[] sequence = generateNotFibonacci(terms);
        for (long num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter a number of its position: ");
        long number = scanner.nextLong();

        int position = checkOutput(number);
        System.out.println("Position: " + position);
    }

    public static long[] generateNotFibonacci(int terms) {
        long[] sequence = new long[terms];

        // Base cases
        sequence[0] = 0;
        if (terms > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < terms; i++) {
            sequence[i] = (3 * sequence[i - 1]) + (2 * sequence[i - 2]);
        }

        return sequence;
    }

    public static long notFib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (3 * notFib(n - 1)) + (2 * notFib(n - 2));
        }
    }

    public static int checkOutput(long pos) {
        int i = 0;

        while (true) {
            long a = notFib(i);

            if (a >= pos) {
                if (a == pos) {
                    return i + 1;
                } else {
                    return i;
                }
            }

            i++;
        }
    }
}


