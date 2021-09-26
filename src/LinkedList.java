public class LinkedList {
    public Node addNode(Node head, int data){
        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {
            Node temp = head; //head = 100, temp = 100
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }

    public Node addNodeAtPostion(Node head, int data, int pos){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            Node temp = head;
            int position = 0;
            while(temp.next != null && position != pos-2){
                temp = temp.next;
                position++;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        return head;
    }
}
