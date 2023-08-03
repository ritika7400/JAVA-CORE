

public class even_oddd {
    public static void main(String[] args) {
        // int n = 97;
        // System.out.println(is_odd(n));

        int arr[] = {2,3,4,2,3,4,5,5,90};
        System.out.println(find_unique(arr));
    }
    // public static boolean is_odd(int n){
    //     return (n&1)==1;

    // }

    // Q- you have given an array of size n and you have to find the unique element among the duplicate
    // ans - XOR the array because a^a = 0;

    public static int find_unique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
    
}
