package lesson11;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ivan",25);
        Person person1 = new Person("Elena",25);
        System.out.println(person.equals(person1));
        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());


    }
}
