

abstract class parent1{

    public parent1(){
        System.out.println("hii");
    }
    public void sayhello(){
        System.out.println("hello from this side ");
    }

    abstract public void greet1();
    abstract public void greet2();

   
}

class child1 extends parent1{
    @Override
    public void greet1(){
        System.out.println("good morning");

    }

    public void greet2(){
        System.out.println("good night");
    }
}

abstract class child2 extends parent1{
    public void greet1(){
        System.out.println("bye");
    }
}




public class abstractclass {
    public static void main(String[] args) {
        //child2 c = new child1();    // BECAUSE PARENT 2 IS AN ABSTRACT CLASS AND IT WILL GIVE AND ERROR

        child1 c = new child1();
        c.greet1();

    }
}
