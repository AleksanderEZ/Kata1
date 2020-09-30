
import java.time.LocalDate;
import static java.util.Calendar.MONTH;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1934, MONTH.MARCH, 31));
        System.out.println(person.getName() + "=" + person.getYears());
}
}
