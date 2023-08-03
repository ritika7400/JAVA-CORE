import java.util.Arrays;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

// public class AllAboutArray {
//     public static void main(String[] args) {
        
    

//     int [][] arr = new int[3] [3];
    
//     Scanner in = new Scanner(System.in);
//     for(int row =0; row<arr.length;row++){
//         for(int col = 0;col<arr[row].length;col++){
//             arr[row][col] = in.nextInt();

//         }
        
//     }


// for(int row =0; row <arr.length;row++){
//     for(int j = 0;j<arr[row].length;j++){
//         System.out.print(Arrays.toString(arr));
//     }
//     System.out.println();
// }
//     }
// }






// public class AllAboutArray{
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,-7,8,9};
//         System.out.println(min(arr));;
//     }

//     public static int min(int arr[]){
//         int ans = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<ans){
//                 ans = arr[i];
//             }
//         }
//         return ans;
//     }
// }





// public class AllAboutArray{
//         public static void main(String[] args) {
//             int [] arr = {1,2,3,-7,8,9};
//             System.out.println(max(arr));;
//         }
//         public static int max( int arr[]){
//             int max = arr[0];
//             for(int i=00;i<arr.length;i++){
//                 if(arr[i]>max){
//                     max = arr[i];
//                 }
//             }
//             return max;
//         }


//     }



// public class AllAboutArray{
//     public static void main(String[] args) {
//         int [][] arr = {
//         {2,3,4,6},
//         {34,67},
//         {21,89,45,23,57}
//         };
//        int ans = search(arr, 67);
//        System.out.println(ans);
//     }

//     public static int search(int arr[][],int target){
        
//         for(int row = 0; row<arr.length;row++){
//             for(int col=0; col<arr[row].length;col++){
//                 if(arr[row][col] == target){
//                    return 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }





//NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO



// public class AllAboutArray{
//     public static void main(String[] args) {
//         int arr[] = {1,22,333,4444};
//         System.out.println(findnums(nums));
//     }

//     static int findnums(int[] nums){
//         int count = 0;
//         for(int num : nums){
//             if(even(nums)){
//                 count ++;
//             }
//         }
//         return count;
//     }

//     int numOfDigits = digits(nums);
//     return numOfDigits%2==0;

//     static int digits(int num){
//         int count =0;
//         while (num>0) {
            
//         }
//     }
// }











public class AllAboutArray {
    public static void main(String[] args) {

        int arr[] [] = {
            {2,3,4},
            {1,2,90},
            {1,2,34}
        };
        int maxWealth = maximumWealth(arr);
        System.out.println(maxWealth);

    }
    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}