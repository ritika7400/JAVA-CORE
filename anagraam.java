import java.util.Arrays;

public class anagraam {
    public static void main(String[] args) {
        is_anagram("race", "car");
    }

    public static void is_anagram(String str1, String str2){
        str1 = str1.toLowerCase(null);
        str2 = str2.toLowerCase(null);

        if(str1.length()==str2.length()){
            char[] charArray = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray);
            Arrays.sort(charArray2);

            Boolean result = Arrays.equals(charArray, charArray2);
            if(result==true){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        
    }
}
