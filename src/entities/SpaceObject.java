package entities;

import java.util.Objects;

public class SpaceObject {
    String name;
    int position;
    int speed;

    public SpaceObject(String name, int position, int speed) {
        this.name = name;
        this.speed = speed;
        this.position = position;
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
        return name == sub.name && position == sub.position && speed == sub.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, speed);
    }

}
