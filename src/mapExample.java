import java.util.HashMap;
import java.util.Map;

public class mapExample {

    public static void main(String[] args) {
        Map<Integer,String> states = new HashMap<Integer, String>();
        states.put(1354, "Alabama");
        states.put(20, "Washington");
        states.put(345, "California");
        states.put(52, "Minnesota");
        states.put(4, "Kansas");


        for (Map.Entry<Integer, String> i: states.entrySet()){
            System.out.printf("Key %s Value %s \n", i.getKey(), i.getValue());
        }
        System.out.println("_______");

        System.out.println(states.get(3));
        System.out.println("_______");

        Map<String,String> prof = new HashMap<String, String>();
        prof.put("electronic-engineer", "Sergey");
        prof.put("Java developer", "Arthur");
        prof.put("Android developer", "Arthur.A");
        prof.put("electronic-engineer", "Vasiliy"); // Сергей выводиться не будет
        System.out.println(prof);
        System.out.println("_______");

        System.out.println(prof.get("Java Developer"));
        System.out.println("_______");

        System.out.println(prof.get("Java developer"));
        System.out.println("_______");

        System.out.println(prof.keySet());
        System.out.println("_______");

        System.out.println(prof.values());
        System.out.println("_______");

        prof.replace("electronic-engineer", "Sergey");
        System.out.println(prof);
        System.out.println("_______");

        prof.remove("electronic-engineer");
        System.out.println(prof);
        System.out.println("_______");

        for (Map.Entry<String, String> i: prof.entrySet()){
            System.out.printf("Key %s Value %s \n", i.getKey(), i.getValue());
        }
        System.out.println("_______");

        Map<String, Person> jobpeople = new HashMap<String, Person>();

        jobpeople.put("Doctor", new Person("Samat"));
        jobpeople.put("Programmer", new Person("Arthur"));
        jobpeople.put("Teacher", new Person("Arthur.A"));
        jobpeople.put("Police", new Person("Azamat"));
        jobpeople.put("Psychologist", new Person("Radmir"));
        System.out.println(jobpeople);
        System.out.println("_______");

        for (Map.Entry<String, Person> k: jobpeople.entrySet()){
            System.out.printf("Key %s Value %s \n", k.getKey(), k.getValue().getPerson());
        }
        System.out.println("_______");
        for (Map.Entry<String, Person> k: jobpeople.entrySet()){
            System.out.printf("Key %s Value %s \n", k.getKey(), k.getValue().getPerson());
        }

    }



}
