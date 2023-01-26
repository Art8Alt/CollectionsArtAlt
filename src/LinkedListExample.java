import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        states.add("Alabama");
        states.add("Alaska");
        states.add("Washington");
        states.add("Virginia");
        states.add("Hawai");
        states.add("California");
        states.add("Kansas");
        states.add("Massachusetts");
        states.add("Minnesota");
        states.add("Mississippi");
        states.add("Maine");
        states.add("Nebraska");
        states.add("Nevada");
        states.add("New Jersey");
        states.add("New York");
        states.add("New Mexico");
        states.add("Ohio");
        states.add("Pennsylvania");
        states.add("Rhode Island");
        states.add("North Carolina");
        states.add("Texas");
        states.add("Florida");
        states.addFirst("South Carolina");
        states.addLast("Utah");

        System.out.println(states.size());
        System.out.println(states.get(1));

        System.out.println("______");

        for (String state : states){
            System.out.println(state);
        }
        System.out.println("______");

        System.out.println(states.contains("New Island"));

        System.out.println("______");

        LinkedList<Person> personLinkedList = new LinkedList<Person>();

        personLinkedList.addFirst(new Person ("Arthur"));
        personLinkedList.add(new Person("David"));
        personLinkedList.addLast(new Person("Rinat"));

        for (Person person : personLinkedList){
            System.out.println(person.getPerson());
        }
    }
}
