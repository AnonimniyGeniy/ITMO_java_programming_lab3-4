public class SpaceObject {
    String Name;
    int Position;
    int Speed;
    public SpaceObject(String Name, int Position, int Speed){
        this.Name = Name;
        this.Speed = Speed;
        this.Position = Position;
    }

    @Override
    public String toString() {
        return Name;
    }
}
