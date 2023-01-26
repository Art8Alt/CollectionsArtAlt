import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortedMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(1354, "Alabama");
        states.put(20, "Washington");
        states.put(345, "California");
        states.put(52, "Minnesota");
        states.put(4, "Kansas");

        for (Map.Entry<Integer, String> i: states.entrySet()){
            System.out.printf("Key %s Value %s \n", i.getKey(), i.getValue());
        }
        System.out.println("_______");

        TreeMap<String, String> contacts = new TreeMap<String, String>();
        contacts.put("Sergey", "8946535794");
        contacts.put("Vasiliy", "9835437354");
        contacts.put("Arthur", "5483848354");
        contacts.put("Boris", "123548435438");
        contacts.put("Amina", "15435134354");

        for (Map.Entry<String, String> i: contacts.entrySet()){
            System.out.printf("Контакт: %s Номер: %s \n", i.getKey(), i.getValue());
        }
        System.out.println("_______");

        Map<String, String> afterContact = contacts.tailMap("Arthur");
        System.out.println(afterContact);
        System.out.println("_______");

        Map<String, String> beforeContact = contacts.headMap("Arthur");
        System.out.println(beforeContact);
        System.out.println("_______");

        System.out.println(states.lastEntry());
        System.out.println("_______");

        Map<String, Person> jobpeople = new TreeMap<String, Person>();

        jobpeople.put("Doctor", new Person("Samat"));
        jobpeople.put("Programmer", new Person("Arthur"));
        jobpeople.put("Teacher", new Person("Arthur.A"));
        jobpeople.put("Police", new Person("Azamat"));
        jobpeople.put("Psychologist", new Person("Radmir"));
        for (Map.Entry<String, Person> k: jobpeople.entrySet()){
            System.out.printf("Key: %s Value: %s \n", k.getKey(), k.getValue().getPerson());
        }
        System.out.println("_______");
    }
}
