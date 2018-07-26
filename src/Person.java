public class Person {

    private String name;
    private String lastName;
    private int pesel;
    private int age;

    public Person(String name, String lastName, int pesel, int age) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " " + lastName + " " + pesel + " " + age;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        if(this.name == null && other.name != null)
            return false;
        if (!(this.name.equals(other.name)))
            return false;
        if (this.lastName == null && other.lastName != null)
            return false;
        if(!(this.lastName.equals(other.lastName)))
            return false;
        if (this.pesel != other.pesel)
            return false;
        if(this.age != other.age)
            return false;
            return true;
    }
}


