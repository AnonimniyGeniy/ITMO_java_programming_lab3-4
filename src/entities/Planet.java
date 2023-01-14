package entities;

public class Planet extends SpaceObject {
    public int outSpeed;

    public Planet(String name, int outSpeed, int position, int speed) {
        super(name, position, speed);
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
