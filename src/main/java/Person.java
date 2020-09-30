    
import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public int getYears(){
        return years(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    private int years(long fecha){
        return (int) fecha/365;
    }
    
}
