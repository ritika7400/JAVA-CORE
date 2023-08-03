import java.util.Arrays;
import java.util.Scanner;

public class duplication {
    public static void find_dup(int [] arr){
        int i;
        Arrays.sort(arr);
        for(i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate element is :" + arr[i]);
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("enter the elemnets of the array:");
        int arr[] = new int[size];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // int arr[] = {1,2,3,4,1,5};
        duplication.find_dup(arr);
    }
}
