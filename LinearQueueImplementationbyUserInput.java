import java.util.Scanner;
public class LinearQueueImplementationbyUserInput {

    static int N = 10; // Maximum size of a queue
    static int [] queue = new int [N];
    static int F = -1;
    static int R = -1;

    //Method to check if the queue is FULL
    public static boolean isFull(){
        if(R==N-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    //Method to check if the queue is EMPTY.
    public static boolean isEmpty(){
        if(F==-1 || F>R){
            return true;
        }
        else{
            return false;
        }
    }

    /*  *ENQUEUE Operation
         Logic: if(isFull()) write overflow
    */
   public static void enqueue(int ITEM)
   {
    if(isFull()){
        System.out.println("Overflow: Queue is full");
        return;
    }
    if(F== -1)
    {
        F=0;
        R=0;
    }else{
        //Increment rear
        R = R+1;
    }
    queue[R]= ITEM;
    System.out.println(ITEM + "is inserted successfully..");
   }
   //Method for implementing Dequeue....
  //Check if the queue is Empty
  public static void dequeue(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
 int ITEM = queue[F];
 if(F==R){
    F=-1;
    R= -1;
 }else{
   F= F+1;
 }
System.out.println(ITEM + " is removed from queue");
}
//Implementing display method...
public static void display()
{
    if(isEmpty())
    {
        System.out.println("Queue is empty");
    }
    System.out.println("Queue elements:");
    for(int i=F; i<=R;i++)
    {
        System.out.print(queue[i] + "");
    }
    System.out.println();
}
public static void main(String [] args)
{
    //Create Menu for Enqueue
 Scanner sc = new Scanner(System.in);
 int choice;
 int elements;

 while(true)
 {
    System.out.println("----------Queue Menu----------");
    System.out.println("1: Is Empty");
    System.out.println("2: Is Full");
    System.out.println("3: ENQUEUE (Insert)");
    System.out.println("4: DEQUEUE (Deletion)");
    System.out.println("5: Display element in Queue");
    System.out.println("6: Exit");
    choice = sc.nextInt();

    switch(choice){
        case 1:
            System.out.println("Queue is empty" + isEmpty());
            break;
        case 2:
            System.out.println("Queue is full" + isFull());
        case 3:
            System.out.println("Enter the elements to insert");
             elements= sc.nextInt();
            enqueue(elements);

        case 4:
         dequeue();
         break;
        case 5:
            display();
            break;
        case 6:
         System.out.println("Exiting....");
         System.exit(0);
         sc.close();
         break;


    }

 }

}

}
