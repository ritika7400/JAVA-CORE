
class div{
    int a;
    int b;
    void avg(int a,int b){
        this.a = a ;
        this.b = b;
        
        try {
            System.out.println(a/b); 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}




public class exceptionhandling1{
    public static void main(String[] args) {
        
    
    div d = new div();
   d.avg(2,0);
    
}
}