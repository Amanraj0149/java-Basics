import java.util.Scanner;

public class FibonacciRecursive {
    
    // Recursive function to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        sc.close();
    }
}
