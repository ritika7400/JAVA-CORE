public class first_half_sec_half {
    public static void main(String[] args) {
        int arr[] = {1,7,9,90,89,34};
        print_order(arr);
    }
public static void print_order(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length/2;j++){ if(arr[j]>arr[j+1])
            {
                swap(arr,j,j+1);
            }
        }
        for(int j=arr.length/2;j>0;i++){ if(arr[j+1]<arr[j])
            {
                swap(arr, j,j+1);
            }
        }
}
    for(int i = 0; i < arr.length-1; i++){
         System.out.print(arr[i] + " ");
    }

    }
private static void swap(int arr[],int j, int i) {
    int temp = arr[j];
    arr[j] = arr[j+1];
    arr[j+1] = temp;

}
}
