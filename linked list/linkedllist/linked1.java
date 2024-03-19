

class linked1{
    public static void main(String[] args) {
        likedlist list = new likedlist();
        list.add_first(2); 
        System.out.println(list.head);
    }
}
class node{
    int data;
    node next;
}
class likedlist{
    node head;
    node tail;
    int size;
    public void add_last(int val){
        node temp=new node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
            size++;
        }
        else{
            //link
            tail.next=temp;
            tail=temp;
            size++;
        }

    }
    public void add_first(int val){
        node temp=new node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
            size++;
        }
        else{
            
            temp.next=head;
            head=temp;
            size++;
        }

    }
}