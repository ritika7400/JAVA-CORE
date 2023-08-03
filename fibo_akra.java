public class fibo_akra {
    public static void main(String[] args) {
        System.out.println(fibo_formula(5));
    }

    public static int fibo_formula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
