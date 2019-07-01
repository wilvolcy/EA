import javax.persistence.*;
import java.util.Objects;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
    private long id;
    private int year;
    private String model;
   @ManyToOne
    private Employee employee;

    public Laptop(){}
    public Laptop(int year, String model){
        this.year = year;
        this.model = model;
    }

    public void setEmployee(Employee owner){
        this.employee = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id &&
                year == laptop.year &&
                Objects.equals(model, laptop.model) &&
                Objects.equals(employee, laptop.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, model, employee);
    }
}
