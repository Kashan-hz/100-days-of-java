import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the number");
        int x  = s.nextInt();

        System.out.println("Prime factors of "+x+" are: ");
        for(int i=2;i<=x;i++){
            if(x%i==0){
                int p=0;
                for(int j=2; j<i;j++){
                    if(i%j==0){
                        p++;
                        break;
                    }
                }
                if(p==0){
                    System.out.println(i);
                }
            }
        }
    }
}
