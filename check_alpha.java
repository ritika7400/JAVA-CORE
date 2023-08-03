import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class check_alpha {
    public static void main(String[] args) {
    String strr = "programing";
    int ind = strr.indexOf("o");
    System.out.println(ind);
    StringBuilder sb = new StringBuilder();
     for (int i =0;i<strr.length()-1 ;i++ ){
         char ch = strr.charAt(i);
         int idx = strr.indexOf(ch, i+1);
         if(idx == -1){
            sb.append(ch);
         }
     } 
     System.out.println(sb);
	
	HashSet<Character> hs = new LinkedHashSet<>();
    
    System.out.println(hs);
  
        
    }
}
