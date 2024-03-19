import java.util.*;
public class h2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        String temp=sc.nextLine();
        String arrStr[] = temp.split(" ");

        int j=0;
        for(int i=0;i<arrStr.length;i++){
            str.insert(Integer.parseInt(arrStr[i])+j,"*");
            j++;

        }
        System.out.println(str);


    }
}