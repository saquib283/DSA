package Searching;

import java.util.Scanner;

public class BinarySearch{
    

    private static void search(int[] arr , int key){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array : " );

        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i=0 ; i<arr.length;i++){
        System.out.println("Enter "+i+" Element : " );
        arr[i]=sc.nextInt();

        }

        search(arr, 5);
        

    }
}