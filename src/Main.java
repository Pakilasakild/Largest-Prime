import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int n) {
        if (n <= 1){
            return -1;
        }
        for (int i = n; i > 2; i--) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(getLargestPrime(n));
    }
}