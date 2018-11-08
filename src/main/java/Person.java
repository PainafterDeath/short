public class Person {
    private String name;
    private Person fiend;

    public Person(String name, Person fiend) {
        this.fiend = fiend;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getFiend() {
        return fiend;
    }
}
