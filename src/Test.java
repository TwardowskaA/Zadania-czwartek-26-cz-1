public class Test {

    public static void main(String[] args) {


        Person person = new Person("Jan", "Kowalski", 8372169, 25);
        Person person1 = new Person("Jan", "Kowalski", 8372169, 25);
        Person person2 = new Person("Iwona", "Bogacka", 7634918, 30);

        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        if (person.equals(person1)) {
            System.out.println("równe");

        } if (person1.equals(person2))
            System.out.println("różne");
    }

}







