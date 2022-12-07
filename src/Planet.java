public class Planet extends SpaceObject{
    int OutSpeed;
    public Planet(String Name, int OutSpeed, int position, int Speed){
        super(Name, position, Speed);
        this.OutSpeed = OutSpeed;
    }
}
