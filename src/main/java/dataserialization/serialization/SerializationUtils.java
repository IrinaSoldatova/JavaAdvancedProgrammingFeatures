package dataserialization.serialization;

import java.io.*;

public class SerializationUtils {
    public static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Сериализация: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person deserializePerson(String filename) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println("Десериализация: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}
