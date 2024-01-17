import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();

        int result = factorial(number);
        System.out.println("The Factorial of "+number+" is : "+result);
    }

    private static int factorial(int number) {
        if(number == 0 || number==1){
            return 1;
        }

        return factorial(number-1)*number;

    }
}
