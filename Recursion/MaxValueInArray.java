import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of The array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " +i +" Element");
            arr[i]=sc.nextInt();
        }

        int res=findMax(arr,0);
        System.out.println(res);
    }

    private static int findMax(int[] arr, int index) {
        if(index==arr.length){
            return -1;
        }
 
        int mx = 0;

        


    }
}
