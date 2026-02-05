import java.util.Scanner;
public class linkedListImplementation {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    // 1. Insert at beginning
    public void insertAtBeginning(int element)
    {
       Node newNode = new Node(element);
       newNode.next = head;
       head = newNode;
       System.out.println("Element inserted at the beginning");
    }
    public  void traverse()
    {
        if(head == null)
        {
         System.out.println("List is empty");
         return;
        }
       Node temp = head;
       System.out.println("List of elements:");
       while(temp!= null)
       {
        System.out.print(temp.data + " ");
        temp = temp.next;
       }
    }
    public static void main(String [] args)
    {
        linkedListImplementation linkedlist = new linkedListImplementation();
        Scanner sc = new Scanner(System.in);

        //Creating menu for LinkedList....
        while (true)
        {
        System.out.println("----------LinkedList Menu----------");
        System.out.println("1: Is Insert at first");
        System.out.println("2: Inserting at Last");
        System.out.println("3: Traverse");
        System.out.println("4: Size");
        System.out.println("5. search for an element");
        System.out.println("6: Delete from beginning");
        System.out.println("7: Delete from last");
        System.out.println("8: Exit");

        int choice = sc.nextInt();
        switch(choice)
        {
          case 1:
            System.out.println("Enter elements");
            linkedlist.insertAtBeginning(sc.nextInt());
            break;

          case 3:
            linkedlist.traverse();
            break;
        }


          sc.close();
        }

    }
}
