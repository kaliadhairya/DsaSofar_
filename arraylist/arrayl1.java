import java.util.*;
class arrayl1{
    public static void main(String[] args) {
        ArrayList <Integer>l1=new ArrayList<>();
        ArrayList <Integer>l2=new ArrayList<>();
        l2.add(2);
        l2.add(22);
        l1.add(1);
        l1.add(6);
        l1.add(4);
        l1.add(4); 
        
        // l1.clear();
        l1.addAll(l2);
        // System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(1));

        for (int i =0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }

}