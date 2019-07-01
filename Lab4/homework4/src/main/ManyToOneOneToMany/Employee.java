import javax.persistence.*;


import java.util.HashSet;

import java.util.Set;

@Entity
public class Employee {
@Id
@GeneratedValue
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private Set<Laptop> laptops = new HashSet<Laptop>();



    public Employee(){}

    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }
    public  void addLaptop(Laptop laptop){
        laptop.setEmployee(this);
        this.laptops.add(laptop);
    }


}
