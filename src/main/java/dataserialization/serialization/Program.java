package dataserialization.serialization;

import static dataserialization.serialization.SerializationUtils.deserializePerson;
import static dataserialization.serialization.SerializationUtils.serializePerson;

public class Program {
    public static void main(String[] args) {
        String filename = "person.txt";
        Person person = new Person("Veronika", 21);
        serializePerson(person, filename);
        deserializePerson(filename);
    }
}
