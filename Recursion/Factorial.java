import java.util.Scanner;

public class Factorial {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        int factorial = findfactorial(n);
        System.out.println(factorial);
        

     }

    private static int findfactorial(int n) {
        if (n==1 || n==0){
            return 1;
        }
        return n*findfactorial(n-1);
    }
}