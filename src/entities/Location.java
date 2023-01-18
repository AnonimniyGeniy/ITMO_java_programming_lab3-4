package entities;

public class Location {
    int x;
    int y;
    int z;


    public Location(SpaceObject parent){
        this.x = parent.location.x;
        this.y = parent.location.y;
        this.z = parent.location.z;
    }

    public Location(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    long Distance(Location obj){
        int dx = x - obj.x;
        int dy = y - obj.y;
        int dz = z - obj.z;
        return Math.round(Math.sqrt(dx*dx + dy*dy + dz*dz));
    }
}
