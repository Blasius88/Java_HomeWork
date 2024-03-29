package Lector17.Task17_5;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
    public String getPerson() {
        return firstName + " " + lastName + " " + age;
    }
}
