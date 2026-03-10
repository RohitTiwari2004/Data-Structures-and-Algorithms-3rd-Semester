public class fibonacci {

    static int fibo(int n)   //Base condition
    {
        if(n<=1)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);   //Recursive condition
    }
    public static void main(String[] args)
    {
        int n=7;
        for(int i=0;i<n;i++)
        {
            System.out.println(fibo(i) + " ");
        }
    }

}
