
import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1934, Month.AUGUST, 12));
        System.out.println(person.getName() + "=" + person.getYears());
}
}
