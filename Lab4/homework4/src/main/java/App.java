import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static EntityManagerFactory emf;
    public static void main(String Args[]){
        emf = Persistence.createEntityManagerFactory("amp");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Owner volcy = new Owner("Volcy Jean WIlbert","carffour Feuilles");
        Owner volcy2 = new Owner("Volcy Jean WIlbert","carffour Feuilles");
        Car car1 = new Car(2004,"Rav4","4 Cyl");
        Car car2 = new Car(2004,"Rav4","4 Cyl");
        Car car3 = new Car(2004,"Rav4","4 Cyl");

        Car car4 = new Car(2004,"Rav4","4 Cyl");
        Car car5 = new Car(2004,"Rav4","4 Cyl");

        volcy.addCar(car1);
        volcy.addCar(car2);
        volcy.addCar(car3);


        volcy2.addCar(car4);
        volcy2.addCar(car5);

        em.persist(volcy);
        em.persist(volcy2);

        em.getTransaction().commit();
        em.close();

//        em = emf.createEntityManager();
//        em.getTransaction().begin();
//        Owner result = em.find(Owner.class , 1L);
//
//        System.out.println(result);
//        em.remove(result);
//        em.getTransaction().commit();
//        em.close();

    }
}
