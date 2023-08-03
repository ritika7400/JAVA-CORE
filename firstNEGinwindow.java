import java.util.ArrayList;

public class firstNEGinwindow {


static ArrayList<Integer> list=new ArrayList<Integer>();
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {-8, 2 ,3 ,-6, 10};
        int size = 2;
        find_negative(arr, size, list);
    }
    public static void find_negative(int arr[], int size, ArrayList<Integer> list){
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1 < size){
                j++;
            }
            else{
                if(list.size() == 0) System.out.println(0+"");
                else{
                    System.out.println( list.get(0));
                }
                if(arr[i] == list.get(0)){
                    list.remove(0);
                }
            }
            i++;
        }
    }
}
