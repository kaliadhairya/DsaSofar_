public class MultiplicationTable {
 static void pattern(int n ){
    for(int i=n ;i>=n;i--){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    
 }
public static void main(String[] args) {
       pattern(6);
}
}

