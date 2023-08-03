import java.util.PriorityQueue;

public class connect_n_ropes {
    public static void main(String[] args) {
        int arr[] = {2,5,4,8,6,9};
        int res = min_cost(arr);
        System.out.println(res);
    }

    public static int min_cost(int arr[]){
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int cost = 0;
        while(pq.size()>1){
        int first = pq.poll();
        int second = pq.poll();
        int sum = first+second;
        cost += sum;
        pq.add(sum);

        }
        return cost;
    } 
}
