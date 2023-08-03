import java.util.Arrays;

public class disntinct {
    public static void main(String[] args) {
        int arr[] = {1,2,42,13,3,55,23,55,45,6,25,5,5,53,34,34,33,35};
        Arrays.sort(arr);
        int flag = 0 ;
        for (int i = 0; i < arr.length; i++) {
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                flag = 1;
                i++;
            }
            if(flag ==1){
                System.out.println(arr[i-1]+ "");
            }
        }
       

    }
    
}
