import java.util.Scanner;

public class StackOperation {

  static final int MAX = 100; // Maximum size of the stack
  static int[] stack = new int[MAX];
  static int top = -1;
  // Check if the stack is empty
  static boolean isEmpty(){
    return top<0;
  }
  //Check if the stack is full...
  static boolean isFull ()
  {
     return top>= MAX-1;
  }
  //Check the size of the stack..
  static int stackSize(){
    return top+1;
  }
  // PUSH OPERATION
  static void pushOperation(int element){
    if(isFull())
    {
     System.out.println("Stack Overflow !! Cannot push the element");
     return;
    }
    stack[++top] = element;
    System.out.println("The pushed element in the stack is:" +element);
  }
  // POP Operation.
  static void popOperation()
  {
    if(isEmpty())
    {
        System.out.println("Stack Underflow !! Cannot pop the element");
        return;
    }
    int element = stack[top--];
     System.out.println("Element gets popped" +element);
  }
  // Peek Operation
  static void peekOperation(){
   if(isEmpty())
   {
    System.out.println("Stack Underflow !!");
   }
    int element = stack[top];
    System.out.println("Peek Element is :" +element);

  }
  // Display Operation ....
  static void displayOperation()
  {
    if(isEmpty())
    {
        System.out.println("Stack is Empty !! || Stack Underflow ");
        return;
    }
    System.out.println("The elements in the stack is:");
    for(int i=top;i>=0;i--)
    {
        System.out.println(stack[i]);
    }
  }
 public static void main (String[] args)
 {
   Scanner sc = new Scanner(System.in);
   while(true){
    System.out.println( "========= STACK MENU ======");
    System.out.println( "1. Is stack empty");
    System.out.println( "2. Is stack full");
    System.out.println( "3. Stack Size");
    System.out.println("4. Push Operation");
    System.out.println("5. Pop Operation");
    System.out.println("6. Peek Operation");
    System.out.println("7. display Operation");
    System.out.println("8. Exit the program.");
    int  choice = sc.nextInt();
    switch(choice)
    {
        case 1:
            System.out.println("Is stack empty" + isEmpty());
            break;
        case 2:
            isFull();
            break;
        case 3:
            System.out.println( "Stack Size" + stackSize());
            break;
        case 4:
            System.out.println("Enter the element you want to push:");
            int element = sc.nextInt();
            pushOperation(element);
            break;
        case 5:
            popOperation();
            break;
        case 6:
           peekOperation();
            break;
        case 7:
            displayOperation();
            break;
        case 8:
            System.out.println("Thank you. Exiting....");
            sc.close();
            return;
        default:
            System.out.println("Invalid choice. Try again");

    }

   }
 }
}
