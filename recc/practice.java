
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Object arr[]=new Object[10];
        //int arr1[]=new int[10];
        // for(int i=0;i<arr.length;i++){
        //     if(i%2==0)arr[i]=sc.nextInt();
        //     else sc.next();
        // }
        // for(int i=0)
        
        int arr1[]={1,2,3,4,5,4,3,2,1};
        // String arr2[]=new String[3];
        // for(int i=0;i<arr1.length;i++){
        //     arr1[i]=sc.nextInt();
        //     arr2[i]=sc.next();
        // }
        // System.out.println("enter");
        // int x=sc.nextInt();
        // for(int i=0;i<arr1.length;i++){
        //     if(arr1[i]==x)System.out.println(arr2[i]);

        // }
        // for(int i=0;i<arr1.length;i++){
        //     int x=0;
        //     int a=sum(arr1,x,i);
        //     int b=sum(arr1,i+2,arr1.length-1);
        //     if(a==b){
        //         System.out.print(i+1);
        //     }
        //    // System.out.println(sum(arr1,x,i)+" "+sum(arr1,i+2,arr1.length-1));
        // }

        
    }
    public static int sum(int arr[],int i,int j) {
        int sum=0;
        for(int x=i;x<=j;x++)sum+=arr[x];
        return sum;
    }
}
