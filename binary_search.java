public class binary_search {
    public static void main(String[] args) {
        int arr[] = {2,23,24,45,56,67,89,90};
        int ans = Bin(arr,45);
        System.out.println(ans);
    }

    static int Bin(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
