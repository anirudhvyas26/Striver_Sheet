package recurssion;

public class fibonacci {

    // Recursive function to calculate Fibonacci number
    static int fab(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fab(n - 1) + fab(n - 2);
    }

    // Function to print Fibonacci series up to n terms
    static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fab(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;  // Number of terms in the Fibonacci series

        System.out.println("The value of Fibonacci at position " + n + " is: " + fab(n));
        System.out.print("The Fibonacci series up to " + n + " terms is: ");
        printFibonacciSeries(n);
    }
}
