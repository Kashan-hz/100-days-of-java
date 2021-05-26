import java.util.*;
import java.lang.*;
class sunny
{
    int isperfect(int n)
    {
        int s=0;
        while(n>9)
        {
            while(n>0)
            {
                int d=n%10;
                s+=d;
                n=n/10;
            }
            n=s;
        }
        if(n==7 || n==1 || n==4 || n==9)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[])
    {
        sunny obj =new sunny();
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the no.");
        int n=ob.nextInt();
        if(obj.isperfect(n+1)== 1)
            System.out.println("no. is sunny");
        else{
            System.out.println("Not a sunny number");
        }
    }
}