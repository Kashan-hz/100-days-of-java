import java.util.Scanner;

public class Factorial_rec {
    public static int fact(int x){
        if(x==0||x==1){
            return 1;
        }
        else{
            return fact(x-1)*x;
        }

    }

public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = s.nextInt();
    System.out.println(fact(num));
}
}