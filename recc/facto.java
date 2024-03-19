import java.util.*;
public class facto{
    public static void main(String[] args) {
        LinkedList<Integer>arr1=new LinkedList<>();
        // ArrayList<Integer>ev1=new ArrayList<>();
        // ArrayList<Integer>od1=new ArrayList<>();

       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       while(n!=-1){
           arr1.add(n);
           n=sc.nextInt();
        }
        arr1.addFirst(1);
        // for(Integer i:arr1){
        //     if(i%2==0)ev1.add(i);
        //     else od1.add(i);
        // }
        // for(Integer i:ev1)System.out.print(i+" ");
        // System.out.println();
        // for(Integer i:od1)System.out.print(i+" ");
        //Collections.sort(arr1);
        //System.out.print(arr1);


        // arr1.remove(arr1.size()/2-1);
        // System.out.println(arr1);
    }

}




