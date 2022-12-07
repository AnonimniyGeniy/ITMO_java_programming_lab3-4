package entities;

public class Planet extends SpaceObject {
    public int outSpeed;

    public Planet(String name, int outSpeed, int position, int speed) {
        super(name, position, speed);
        this.outSpeed = outSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
