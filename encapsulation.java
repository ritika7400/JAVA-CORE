
class encap{
    private String name;
    private int age;
    private double salary;


    public String get_name(){return name;}

    public int get_age(){ return age;}


    public double get_sal(){return salary;}


    public void set_name(String newname){ name = newname;}

    public void set_age(int newage){ age = newage;}

    public void set_sal(double sal){ salary = sal;}


}

public class encapsulation {
    public static void main(String[] args) {
        encap  en = new encap();
        en.set_name("juhi");
        en.set_age(20);
        en.set_sal(50000.00);


        System.out.println(en.get_name() +" " + en.get_age() +" "+  en.get_sal());


    }
}
