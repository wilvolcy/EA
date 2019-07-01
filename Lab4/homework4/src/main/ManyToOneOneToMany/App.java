import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static EntityManagerFactory emf;
    public static void main(String Args[]){
        emf = Persistence.createEntityManagerFactory("emplapdb");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Employee volcy = new Employee("Volcy Jean Wilberr" , "Carrefour Feuilles");
        Laptop lap1 = new Laptop(2010,"Del");
        Laptop lap2 = new Laptop(2014,"HP");
         volcy.addLaptop(lap1);
         volcy.addLaptop(lap2);



        em.persist(volcy);

        em.getTransaction().commit();
        em.close();

       /* em = emf.createEntityManager();
        em.getTransaction().begin();
        Employee result = em.find(Employee.class , 1L);

        System.out.println(result);
        em.remove(result);
        em.getTransaction().commit();
        em.close();*/

    }
}
