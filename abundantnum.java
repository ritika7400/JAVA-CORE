public class abundantnum {
    public static void main(String[] args) {
        int n=18;
        int res =0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                res += i;
            }
            
        }
        if(res > n) System.out.println("yes, it is");
            else{
                System.out.println("no its not an abundant number");
            }
    }
}
