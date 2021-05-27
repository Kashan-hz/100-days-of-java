import java.util.Scanner;

public class areaCircle {
    public static void Circle(){
        Scanner s = new Scanner(System.in);
        int r;
        System.out.println("Enter the radius");
        r = s.nextInt();
        System.out.println("Area of cirlce is "+ (3.14*r*r)+" .");

    }
    public static void main(String[] args){
        Circle();
    }
}
