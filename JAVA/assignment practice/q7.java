import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class q7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // formatter
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern(
            "dd-MM-yyyy"
        );

        // input date
        System.out.print(
            "Enter date (dd-MM-yyyy): "
        );

        String input = sc.nextLine();

        // convert string to LocalDate
        LocalDate date =
        LocalDate.parse(input, formatter);

        // after 30 days
        LocalDate after30Days =
        date.plusDays(30);

        // before 15 days
        LocalDate before15Days =
        date.minusDays(15);

        // display results
        System.out.println(
            "Date after 30 days: "
            + after30Days.format(formatter)
        );

        System.out.println(
            "Date before 15 days: "
            + before15Days.format(formatter)
        );
    }
}