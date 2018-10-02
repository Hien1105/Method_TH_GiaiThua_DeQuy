import java.util.Scanner;

public class Method_TH_GiaiThua_DeQuy {
    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        long N = scanner.nextInt();
        long fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }

    public static long factorial(long N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
