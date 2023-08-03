// // import java.util.Scanner;

// public class evennos {
//     public static void main(String [] args){
        
//         System.out.println("enter the number:");

//     //     Scanner kb = new Scanner(System.in);
//     //    int x = kb.nextInt();
        
//         int evennumber=2;
//         int i=0;
//         while(i<10){
//             System.out.println(evennumber);
//             evennumber = evennumber + 2;
//             i++;
//         }
        
//     }
    
// }

public class evennos{
    public static int MAXSUBARRAY(int arr[]){
        int maxsum=0;
        int sum=0;
        for(int i=1; i<arr.length;i++){
            if(sum<arr[i]){
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int ans = MAXSUBARRAY(arr);
        System.out.println(ans);
    }
}