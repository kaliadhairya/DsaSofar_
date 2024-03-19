import java.util.Scanner;

public class st1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str= str.replaceAll("\\s+", "");
        char arr[]=str.toCharArray();
        arr[0]-=32;
        System.out.println(new String(arr)); 
    }

}
