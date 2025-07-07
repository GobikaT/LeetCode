class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
       
    }
 Node head;
    public MyLinkedList() {
         head=null;
    }
    public int get(int index) {
        if(index<0){
            return -1;
        }
        int c=0;
        Node temp=head;
        while(temp!=null&&c<index){
            temp=temp.next;
            c++;
        }
        if(temp==null){
            return -1;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
            newnode.next=head;
            head=newnode;
    }
    
    public void addAtTail(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node newnode =new Node(val);
        if(index<0){
            return ; 
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node temp=head;
        int c=0;
        while(temp!=null&&c<index-1){
            temp=temp.next;
            c++;
        }
        if(temp==null){
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    
    public void deleteAtIndex(int index) {
         if(index<0||head==null){
            return ; 
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        int c=0;
        while(temp!=null&&c<index-1){
            temp=temp.next;
            c++;
        }
        if(temp==null||temp.next==null){
            return;
        }
      temp.next=temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */