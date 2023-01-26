import java.util.ArrayDeque;

public class Queue {

    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<>();

        countries.add("Germany");
        countries.add("Kyrgyzstan");
        countries.add("Russia");
        countries.add("China");
        countries.add("Ukraine");
        countries.add("Belarussia");
        countries.add("USA");

        // getting first element
        String firstEl = countries.getFirst();
        System.out.println(firstEl);

        //getting last element
        System.out.println(countries.getLast());

        //knowing the size
        System.out.println(countries.size());

        while (countries.peek()!= null){
            System.out.println(countries.pop());
        }

        ArrayDeque<Person> peoplePerson = new ArrayDeque<Person>();

        peoplePerson.addFirst(new Person("Tom"));
        peoplePerson.addLast(new Person("Adik"));

        for (Person p: peoplePerson) {
            System.out.println(p.getPerson());
        }

    }

}
