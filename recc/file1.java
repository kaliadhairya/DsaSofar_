import java.util.*;
public class file1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        s=r(s);
        int j=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                res+=r(s.substring(j,i));
                j=i+1;
            }
        }
        res+=r(s.substring(j,s.length()));
        System.out.print(res);
    }
    public static String r(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        sb.append(' ');
        return sb.toString();
        
    }
}
