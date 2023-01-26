import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();

        System.out.println(people.size());

        people.add("Aisulu");
        people.add("Arthur");
        people.add("Azalia");
        people.add("Samat");
        people.add("Askar");
        people.add("David");

        people.add(6,"Georgy");
        System.out.println(people);

        System.out.println(people.get(4));

        people.set(1,"Arthur.A");

        System.out.println(people);

        System.out.println("Размер нашего списка: " + people.size());

        for (String person: people) {
            System.out.println(person);
        }

        if (people.contains("Adilet")){
            System.out.println("This name there");
        }
        else {
            System.out.println("This name is not found");
        }

        people.remove("David");

        System.out.println(people);
        people.remove(5);
        System.out.println(people);

        Object[] peopleArrayOther = people.toArray();

        for (Object person1: peopleArrayOther){
            System.out.println(person1);
        }

    }
}