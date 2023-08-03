public class compressString {
    public static void compressStr(String str){
        StringBuffer sb = new StringBuffer();
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            int count =0;
            while(i<str.length()){
                if(ch==str.charAt(i)){
                ++count;
                ++i;
            }
            else 
                break;
          
        }

        sb.append(ch);
        
        if(count>1){
            sb.append(count);
        }
    }
    System.out.println(sb);
}
public static void main(String[] args) {
    compressStr("ppppppppppRRRRRRRAAAAkkkkAArrSSHH");
}
}
