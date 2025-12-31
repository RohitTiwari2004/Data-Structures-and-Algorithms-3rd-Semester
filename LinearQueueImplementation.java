public class LinearQueueImplementation {

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
// Display method to visualize queue....
public static void display()
{
    if(isEmpty())
    {
        System.out.println("Queue is empty");
    }
    System.out.print("Queue elements:");
    for(int i=F;i<=R;i++)
    {
        System.out.println(queue[i] + "");
    }
    System.out.println();
}
//Main Method ....
public static void main (String [] args)
{
    enqueue(20);
    enqueue(36);
    enqueue(59);
    display();
    dequeue();
    display();
    enqueue(88);
    display();
}

}
