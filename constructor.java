public class constructor {
  

public static void main(String[] args) {
    employee e = new employee();
}
}

class employee{

    int salary;
    String name;
    int Eid;
    public employee(){
        salary = 100000;
        name = "hey harry!";
        Eid = 8;
        System.out.println(salary+ " " + name+ " "+ Eid + "");


    }
}
