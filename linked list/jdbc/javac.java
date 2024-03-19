 

public class javac {
    public static void main(String[] args) {
        String s="abc";
        subsequence(s,"");
    }
    public static void subsequence(String s,String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        subsequence(s.substring(1),ans);
        subsequence(s.substring(1),ans+ch);
    }
}
