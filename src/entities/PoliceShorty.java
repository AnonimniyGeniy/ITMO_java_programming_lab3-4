package entities;

public class PoliceShorty extends Shorty {
    public PoliceShorty(String Name) {
        super(Name);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Policeman";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + "Policeman".hashCode();
    }
}
