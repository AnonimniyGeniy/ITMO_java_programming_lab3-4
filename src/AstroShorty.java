public class AstroShorty extends Shorty{
    Astronomer astro = new Astronomer();
    public AstroShorty(String Name){
        super(Name);
        this.astro = new Astronomer();
    }

    @Override
    public String toString() {
        return super.toString() + " "+ astro.toString();
    }
}
