package Lector17.Task17_5;

import java.util.ArrayList;
import java.util.Comparator;

public class MainTask17_5 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Rita", "Street", 15));
        persons.add(new Person("Karl", "Yong", 20));
        persons.add(new Person("Jenefer-jonior-e", "Yong", 21));
        String res = persons.stream().filter(name -> name.firstName.length() < 16).max(Comparator.comparing(Person::getAge)).get().getPerson();
        System.out.println(res);
    }
}
