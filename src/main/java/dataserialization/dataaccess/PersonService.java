package dataserialization.dataaccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class PersonService {
    private final EntityManagerFactory emf;

    public PersonService() {
        emf = Persistence.createEntityManagerFactory("jpa-example");
    }

    public void createPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public Person updatePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person updatedPerson = em.merge(person);
        em.getTransaction().commit();
        em.close();
        return updatedPerson;
    }

    public void deletePerson(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        em.remove(person);
        em.getTransaction().commit();
        em.close();
    }

    public List<Person> getAllPersons() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> persons = query.getResultList();
        em.close();
        return persons;
    }
}
