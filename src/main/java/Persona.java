
import java.time.LocalDate;

public class Persona{
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getName() {
        return nombre;
    }
    
    public LocalDate getbirthDate(){
        return fechaNacimiento;
    }
    
    public int getYears(){
        return years(LocalDate.now().toEpochDay() - fechaNacimiento.toEpochDay());
    }

    private int years(long l) {
        return (int) l/365;
    }
}