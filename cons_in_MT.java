class Mythr extends thread{
    public Mythr(String name){
       super();
    }

   public void run(){
    
        while(true){
        System.out.println("thread is running");
        
        }
    }

    // public static void start() {
    // }
}







public class cons_in_MT {
    public static void main(String[] args) {
        
    
    Mythr t1 = new Mythr("jugs")
;   t1.run();
    System.out.println("the id of the thread is :" );
}
}
