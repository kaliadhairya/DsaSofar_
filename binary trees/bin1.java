import java.util.Scanner;

public class bin1 {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createTree();
    
}
//creating a node
static Node createTree(){
Node root = null;
System.out.println("enter data: ");
int data = sc.nextInt();


if(data==-1) return null;
root = new Node(data);

System.out.println("Enter left for: " + data);
root.left=createTree();
System.out.println("Enter right for: " + data);
root.right=createTree();
//levelwise input
return root;
}

}
//node
class Node{
    Node left,right; 
    int data;

    public Node(int data){
        this.data=data;

    }
}
         