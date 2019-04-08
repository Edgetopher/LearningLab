package LearningLab;

public class Person {
    private final long id;
    private long name;

    public Person(long id, long name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +" " + name;
    }
}
