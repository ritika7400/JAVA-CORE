import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size of an array");
            int size = sc.nextInt();
            

   //    System.out.println("enter the elements of array");

            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("enter value  to find the array");
            int valuetofind = sc.nextInt();
               
                
               for(int i=0;i<arr.length;i++){
                if(arr[i]==valuetofind){
                    System.out.println("found at index "+ i);
                }
               
                
                
               }
        }
        
        
        }
    }

