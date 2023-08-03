import java.util.Scanner;

public class checkpalindrone{
    public static void main(String[]  args){
        String s = "juujj";
        System.out.println(checkPalindromeString(s));
    }
    static boolean checkPalindromeString(String input) {
boolean result = true;
int length = input.length();
for(int i=0; i < length/2; i++) {
    if(input.charAt(i) != input.charAt(length-i-1)) {
        result = false;
        break;
    }
}
return result;

}
}





class check_palin_number{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int org_num = num;
    int r = 0;{

    while(num!=0){
        r = r*10 + num%10;
        num = num/10;
    }
    if(org_num==r){
        System.out.println("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
}
}
