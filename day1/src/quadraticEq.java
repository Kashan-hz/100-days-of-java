import java.util.Scanner;

public class quadraticEq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of constants a,b,c of quadratic equations");
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();
        double root1,root2;

        //finding determinant(b^2-4ac)
        double det= b*b-4*a*c;

        if (det>0){
            root1 = (-b+ Math.sqrt(det)) /(2*a);
            root2 = (-b- Math.sqrt(det)) /(2*a);

            System.out.format("1st root is %.2f and 2nd root is %.2f",root1,root2);

        }
        else if (det==0){
            root1=-b/ (2*a);
            System.out.format("root1 = root2 = %.2f;", root1);

        }
        else{
            //for complex and distinct
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-det)/(2*a);
            System.out.format("root1 = %.2f+%.6fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.6fi", real, imaginary);
        }
    }
}




