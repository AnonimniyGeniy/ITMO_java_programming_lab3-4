package entities;

import interfaces.*;


public class Astronomer extends Profession implements Observe {
    public Astronomer() {
        super("Astronomer");
    }

    public Location getLocation(SpaceObject object) {
        System.out.println("Position of " + object.name + " is " + object.location.toString());
        return object.location;
    }

    public int getSpeed(SpaceObject object) {
        System.out.println("Speed of " + object.name + " is " + object.speed);

        return object.speed;
    }

    public boolean checkTrajectory(SpaceShip ship, Planet target){
        if(getSpeed(ship) >= target.outSpeed){
            System.out.println("Astronomers checked out ship's trajectory and considered that it moving to the " + target.name);
            return true;
        }else{
            System.out.println("Astronomers checked out ship's trajectory and considered that it doesn't moving to the " + target.name);
            return false;
        }

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + ((name  == null) ? 0 : name.hashCode() * 37);
    }
}
