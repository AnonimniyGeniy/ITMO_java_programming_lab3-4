package entities;

import java.util.ArrayList;


public class Observatory {
    public Observatory(ArrayList<AstroShorty> stuff, Planet location) {
        this.stuff = stuff;
        this.telescope = new Telescope(location);
        System.out.println("Observatory now looking at " + location.name);

    }

    String name;
    ArrayList<AstroShorty> stuff;
    Telescope telescope;

    public void locateTelescope(SpaceObject target) {
        this.telescope.direction = target;
        System.out.println("Telescope now looking at " + target.name);
    }

    class Telescope {
        public Telescope(SpaceObject direction) {
            this.direction = direction;
        }

        public SpaceObject direction;

    }

    public int getSpeed() {
        System.out.println("Observetory found out that target speed is " + telescope.direction.speed);
        return telescope.direction.speed;
    }

    public int getWeight() {
        System.out.println("Observetory found out that target weight is " + telescope.direction.weight);
        return telescope.direction.weight;
    }

    public Location getLocation() {
        System.out.println("Observetory found out that target location is " + telescope.direction.location);
        return telescope.direction.location;
    }

    public ArrayList<SpaceObject> getObjects(ArrayList<SpaceObject> spaceSector) {
        System.out.println("Found these objects in space sector: ");
        for(SpaceObject obj: spaceSector){
            System.out.println(obj);
        }
        return spaceSector;
    }

}

