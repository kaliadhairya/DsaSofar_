import java.util.*;
public class occ {
     void first(int n,int size,int arr[]){
            for(int i=0;i<arr.length;i++){
                if(n== arr[i]){
                    System.out.println(arr[i]);
                }
            }
        }
          void last(int n,int size,int arr[]){
            for(int i=0;i<size-1;i--;){
                System.out.println(arr[i]);
            }
            
        }
    public static void main(String[] args) {
        int count = 0;
        
        int arr[] = {1,2,3,3,3,3,7,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count ++;
            }
        }
      
        // return all occ//3
        // first occ//2
        // last occurence

        // binary search 
        string algoritm
        hashm
        hashset 


    }
    
}
