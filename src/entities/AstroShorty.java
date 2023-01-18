package entities;

public class AstroShorty extends Shorty {
    public Astronomer astro = new Astronomer();

    public AstroShorty(String name) {
        super(name);
        this.astro = new Astronomer();
        //System.out.println("Astronomer constructor called");
    }

    @Override
    public String toString() {
        return super.toString() + " " + astro.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + astro.hashCode();
    }
}
