public class first_last_occr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,5};
        
        int result1 = first_occr(arr, 5);
        int result2 = last_occr(arr, 5);
        System.out.println(result1);
        System.out.println(result2);
        int total_occr = (result2 - result1)+1;
        System.out.println(total_occr);
    }

    public static int first_occr(int arr[], int target){
        int start = arr[0];
        int end = arr.length-1;
        int ans = -1;
        int mid = start+ (end-start)/2;
        while(start<=end){
            
            if(arr[mid]== target){
                ans = mid;
                end = mid-1;;
            }
            else if(arr[mid]> target){
                end = mid-1;
            }
            else if(arr[mid]< target){
                start = mid+1;
            }
            mid = start+ (end-start)/2;
        }
        return ans;
    }

    public static int last_occr(int arr[], int target){
        int start = arr[0];
        int end = arr.length-1;
        int ans = -1;
        int mid = start+ (end-start)/2;
        while(start<=end){
            
            if(arr[mid]== target){
                ans = mid;
                start = mid+1;;
            }
            else if(arr[mid]> target){
                end = mid-1;
            }
            else if(arr[mid]< target){
                start = mid+1;
            }
            mid = start+ (end-start)/2;
        }
        return ans;
    }
}
