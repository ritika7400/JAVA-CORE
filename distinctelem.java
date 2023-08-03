import java.util.HashSet;
import java.util.Set;

public class distinctelem {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,4,5,6};
        int res = distinct(arr);
        System.out.println(res);
    }
    static int distinct(int arr[]){
        Set <Integer> s = new HashSet<>();
        for(int element:arr){
            s.add(element);
        }
        return s.size();
    }
}
