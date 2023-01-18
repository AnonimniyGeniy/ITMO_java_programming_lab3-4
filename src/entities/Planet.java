package entities;

import java.util.ArrayList;

public class Planet extends SpaceObject {
    public int outSpeed;
    //ArrayList<SpaceObject> satellites = new ArrayList<>();
    public Planet(String name, int outSpeed, int position, int speed, int weight, int x, int y, int z) {
        super(name, position, speed, weight, new Location(x, y, z));
        this.outSpeed = outSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Planet sub = (Planet) obj;

        return super.equals(obj) && sub.outSpeed == this.outSpeed;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 53;
    }
}
