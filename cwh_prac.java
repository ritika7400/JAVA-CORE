abstract class pen{
    abstract void write();

    abstract void refil();

}

class gelpen extends pen{
    void write(){
        System.out.println("i am writing...");
    }

    void refil(){
        System.out.println("your ink is going to be finished refil your pen as soon as possoible...");
    }
}





public class cwh_prac {
    public static void main(String[] args) {
        gelpen gp = new gelpen();
        gp.refil();
       System.out.println( gp.hashCode());
       gp.write();
    }
}
