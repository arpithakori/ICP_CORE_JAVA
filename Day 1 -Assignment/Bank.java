import java.util.*;
public class Bank{
    int total=0; int i,j;

    static boolean checkPrime(int v) {
        if (v == 1 || v == 2) {
            return true;
        } else if (v % 2 == 0) {
            return false;
        }
        int sq = (int) Math.sqrt(v);
        for (int i = 3; i <= sq; i += 2) {
            if (v % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                total += arr[i];
            }
        }
        return (total);
    }
    public static void main(String[] args) {
    	int i,s;
    	Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        int [] numbers = new int[100];
        System.out.println("Enter size of an array:");
        s = sc.nextInt();
        System.out.println("Enter array elements:");
        for (i = 0; i < s; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The sum of primes is " + sum(numbers));
    }
}
