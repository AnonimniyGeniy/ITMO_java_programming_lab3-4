package entities;

public class Policeman extends Profession {
    {
        System.out.println("Init block policeman called");
    }

    public Policeman() {
        super("Policeman");
        System.out.println("Policeman constructor called");
    }

    @Override
    public String toString() {
        return name;
    }
    /*
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 97;
    }
}
