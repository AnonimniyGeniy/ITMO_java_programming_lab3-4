public class Plant {
    String Name;
    int Size;
    String Type;
    public Plant(String Name, int Size, String Type){
        this.Name = Name;
        this.Size = Size;
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "Name='" + Name + '\'' +
                ", Size=" + Size +
                ", Type='" + Type + '\'' +
                '}';
    }
}
