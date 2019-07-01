import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    //@Column(name = "Owner_ID")
    private Long id;
    private String name;
    private String address;
    @OneToMany ( cascade = CascadeType.PERSIST, orphanRemoval = true)
//    @JoinTable(name="car_owner", joinColumns = {@JoinColumn(name="car_id")}, inverseJoinColumns = {@JoinColumn(name="owner_id")})
    @JoinColumn(name="Owner_ID")
    private List<Car> cars = new ArrayList<Car>();

    public Owner(){}
    public Owner(String name , String address){
        this.name = name;
        this.address =address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + cars +
                '}';
    }
}
