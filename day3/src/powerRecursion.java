import java.util.Scanner;

public class powerRecursion {
    public static int pow(int x,int y){
        if(y==1){
            return x;
        }
        else{
            return (x*pow(x,y-1));
        }
    }
    public static void main(String[] args){
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base and power");
        a = sc.nextInt();
        b= sc.nextInt();
        System.out.println(pow(a,b));
    }
}
