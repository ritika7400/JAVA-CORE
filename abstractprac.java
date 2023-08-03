abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}


class smarttelephone extends telephone{
    @Override
    void ring(){
        System.out.println("i am ringing ...");
    }
    @Override
    void lift(){
        System.out.println("i am liftng...");
    }
    @Override
    void disconnect(){
        System.out.println("i am dissconnecting...");
    }
}



public class abstractprac {
    public static void main(String[] args) {
        telephone sp = new smarttelephone();
    sp.lift();
    sp.disconnect();
    sp.ring();

        
    }
    
   
}
