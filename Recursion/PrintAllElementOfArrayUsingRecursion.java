import java.util.Scanner;

public class PrintAllElementOfArrayUsingRecursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of The array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " +i +" Element");
            arr[i]=sc.nextInt();
        }

        printElement(arr,0);

    }

    private static void printElement(int[] arr,int index) {
        if(index==arr.length){
            return;
        }
        
        System.out.println(arr[index]);

        printElement(arr, index+1);


    }
}