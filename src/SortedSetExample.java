import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();
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

        for (String s: states)
            System.out.println(s);

        System.out.println("________");

        System.out.println(states.last());
        System.out.println(states.first());

        SortedSet<String> set = states.subSet("Florida", "Texas");
        System.out.println("_________");

        System.out.println(set);
        System.out.println("_________");

        System.out.println(states.higher("California"));
        System.out.println("_________");

        System.out.println(states.lower("California"));
        System.out.println("_________");

    }
}
