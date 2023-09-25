//23.Визначити суму квадратів N перших чисел Фібоначчі
// (спробуйте вивести і перевірити відповідну формулу).

import java.util.Scanner;

/**
 * A class for determining the product of the squares of N prime Fibonacci numbers
 */
public class Fibonacci {
    /**
     * A method that determines the first N numbers and finds the sum of their squares
     * @param n the number of prime numbers in the Fibonacci sequence
     * @return returns the sum of squares
     */
    public static long productOfSquares(int n) {
        long[] arr = new long[n];
        if (n == 1)
            return 1;

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        long a = 0;
        for (int i = 0; i < n; i++) {
            a += arr[i] * arr[i];
        }

        return a;
    }

    /**
     * the main method in the program that reads the number N and starts the calculation of the sum of squares
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість перших чисел: ");
        int n = scanner.nextInt();

        System.out.println("Результат: " + productOfSquares(n));

    }
}