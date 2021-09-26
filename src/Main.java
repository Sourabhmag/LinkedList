import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.println("Please enter the number of nodes");
        int nodes = scanner.nextInt();
        Node head = null;
        for (int i=0;i<nodes;i++){
            System.out.println("Enter number "+ (i+1));
            int data = scanner.nextInt();
            head = linkedList.addNode(head, data);
        }
        linkedList.display(head);

        System.out.println("Add postion");
        int pos = scanner.nextInt();
        System.out.println("Need number");
        int data = scanner.nextInt();
        linkedList.addNodeAtPostion(head, data, pos);
        linkedList.display(head);
    }
}
