import java.util.Scanner;

public class FibonacciSeries {
    static  int fib(int n){
        if(n == 0 ){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(fib(num));

    }
}
