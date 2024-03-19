

class linkedlist{
    static class Node{
        int data;
        Node next;

       Node(int data){
           this.data = data;
           this.next = null;
        }

        public Node addFirst(int data){
            Node newNode= new Node(data);
    
            if(this == null){
                return newNode;
            }
            newNode.next=this;
            return newNode;
        }
    }

    public static void main(String[] args) {
        Node list = new Node();
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list.data);
    }
}