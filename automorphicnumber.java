public class automorphicnumber {
    public static void main(String[] args) {
        int n=25;
        int sq = n*n;
        int rem = sq%10;
        if(n==rem){
            System.out.println("yes it is");
        }
        else
        System.out.println("no its not");
    }
}
