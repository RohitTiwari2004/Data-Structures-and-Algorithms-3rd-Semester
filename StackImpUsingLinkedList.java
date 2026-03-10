class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class StackImpUsingLinkedList {
  static Node top = null;

  //Algorithm for PUSH Operation
  public void push(int element)
  {
     Node newNode = new Node(element);

     //New Node points to the current top
      newNode.next = top;

     //top moves to new node
     top = newNode;
     System.out.println("Pushed element:" +element);
  }
  public int pop()
  {
    if(top == null)
    {
        System.out.println("Stack is empty ! Stack Underflow");
        return -1;
    }
    int element = top.data;
    top = top.next;  //Top moves to next node address
    return element;
  }

  //Peek operation
  public int peek()
  {
    if(top==null)
    {
        System.out.println("Stack is empty ! Stack Underflow");
        return -1;
    }
    return top.data;

  }
  //Display operation ...
  public void display()
  {
    if(top==null)
    {
        System.out.println("Stack is empty !! Stack Underflow");
        return;
    }
    System.out.print("The elements on the stack are ");
    while(top!= null)
    {
        System.out.println(top.data + " ");
        top = top.next;
    }
    System.out.println();

  }
  public static void main(String [] args)
  {
    StackImpUsingLinkedList stack = new StackImpUsingLinkedList();
    stack.push(50);
    stack.push(90);
    stack.push(78);

    int poppedElement = stack.pop();
    System.out.println("Popped element is:" +poppedElement);
    int poppedElement2 = stack.pop();
    System.out.println("Popped Element is :" +poppedElement2);

    stack.display();
  }
}
