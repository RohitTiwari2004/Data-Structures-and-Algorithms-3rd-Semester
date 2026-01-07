import java.util.Scanner;
public class circularQueueImplementation {
    static int N = 10; //Maximum size of queue
    static int [] queue = new int [N];
    static int F = -1;
    static int R = -1;

    //Method to check if Queue is Full....
    public static boolean isFull()
    {
        if((R+1)%N == F)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Method to check if Queue is empty...
    public static boolean isEmpty()
    {
        if(F==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void enqueue (int item)
    {

        if(isFull())
        {
            System.out.println("Queue overflow ");
            return ;
        }
         if(F==-1)
         {
           F=0;
           R= 0;
         }
         else{
            R = (R+1)%N;
         }
         queue[R] = item;
         System.out.println( item + " Element inserted on circular queue successfully" );
    }
    //Method for implementing deqeue...
   public static void dequeue()
   {
    //Check if queue is empty..
     if(isEmpty())
     {
        System.out.println("Queue is empty");
        return;
     }
     int item = queue[F];
     if(F==R)
     {
        F = -1;
        R = -1;
     }
     else
        {
            F = (F+1)%N;
        }
      System.out.println(item + "Element is removed from the queue ");

   }
   //Implementing display method....
   public static void display()
   {
    if(isEmpty())
    {
        System.out.println("Queue is Empty.");
    }
    System.out.println("Queue elements are:");
     int  i = F;
     while(true)
     {
        System.out.println( queue[i] + "");
        if(i==R)
        break;
        else{
            i = (i+1)%N;
        }
    }



   }

   //Create menu for Enqueue
   public static void main(String [] args)
   {
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

    switch(choice)
    {
        case 1:
            System.out.println("Queue is empty" + isEmpty());
            break;
        case 2:
            System.out.println("Queue is full" + isFull());
            break;
        case 3:
          System.out.println("Enter the elements to insert:");
          elements = sc.nextInt();
          enqueue(elements);
          break;
        case 4:
          dequeue();
          break;
        case 5:
            display();
            break;
        case 6:
            System.out.println("Exiting...");
            System.exit(0);
            sc.close();
            break;

    }
    }
   }

}
