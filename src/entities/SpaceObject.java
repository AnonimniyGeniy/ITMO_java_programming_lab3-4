package entities;

import java.util.Objects;

public class SpaceObject {
    public String name;
    int speed;
    int weight;
    long gravity_field;
    public Location location;
    public SpaceObject(String name, int speed, int weight, Location location) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.gravity_field = Math.round(Math.sqrt(weight));
        this.location = location;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        SpaceObject sub = (SpaceObject) obj;
        return name == sub.name && speed == sub.speed && sub.weight == weight;
    }

    @Override

    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + ((name  == null) ? 0 : name.hashCode());
        result = prime * result + speed;
        result = prime * result + weight;
        return result;
    }

}
