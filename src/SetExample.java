import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();
        states.add("Alabama");
        states.add("Washington");
        states.add("California");
        states.add("Kansas");
        states.add("Minnesota");
        states.add("New Jersey");
        states.add("New Jersey");
        states.add("Texas");
        states.add("Texas");
        states.add("Florida");
        states.add("Florida");
        states.add("Florida");


        for (String state: states){
            System.out.println(state);
        }

        System.out.println("_________________");

        HashSet<Person> personHashSet = new HashSet<Person>();
        personHashSet.add(new Person("Arthur"));
        personHashSet.add(new Person("Rishat"));
        personHashSet.add(new Person("Rustam"));
        personHashSet.add(new Person("Rinat"));

        for (Person person: personHashSet){
            System.out.println(person.getPerson());
        }

    }
}
