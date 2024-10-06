package dataserialization.dataaccess;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        PersonService service = new PersonService();

        Person person = new Person();
        person.setName("Dima");
        person.setAge(25);
        service.createPerson(person);

        person.setAge(15);
        Person updatedPerson = service.updatePerson(person);
        System.out.println("Updated Person: " + updatedPerson);

        //service.deletePerson(person.getId());

        List<Person> persons = service.getAllPersons();
        System.out.println("All Persons: " + persons);
    }
}
