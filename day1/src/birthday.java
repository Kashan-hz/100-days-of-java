import java.time.LocalDate;
import java.time.Month;

public class birthday {
    public static void main(String args[]) {


        int birthDate = 25;
        Month birthMonth = Month.MAY;


        LocalDate currentDate = LocalDate.now();
        System.out.println("Todays Date: " + currentDate);


        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();

        if (date == birthDate && month == birthMonth) {
            System.out.println("HAPPY BIRTHDAY TO YOU !!");
        }

    }
}

