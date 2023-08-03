public class finddup2 {
    public static void dup2(int arr[]){
        for(int i=0;i<arr.length;i++){
        int x = Math.abs(arr[i]);
        if(arr[x]>0){
            arr[x] = -arr[x];

        }
        else{
            System.out.println(x);
        }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,5,6};
        dup2(arr);
    }
}

// THIS SOLUTION ONLY WORKS WHEN WE HAVE THE SMALLEST VALUE AS 1 IN OOUR ARRAY . THUS CODE WILL FAIL WHEN WE HAVE ZERO 0 IN THE ARRAY.
