public abstract class Profession {
    public Profession(String Name){
        this.Name = Name;
    }

    String Name;

    @Override
    public String toString() {
        return "Profession{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
