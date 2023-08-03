import java.util.*;



public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>(5);
        list2.add(21);
        list2.add(90);
        list2.add(87);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        list.addAll(0,list2);
       System.out.println( list.equals(list2));
       list.set(4, 4000);
        System.out.println(list.contains(98));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
