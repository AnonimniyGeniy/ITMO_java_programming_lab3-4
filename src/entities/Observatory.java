package entities;

import java.util.ArrayList;

public class Observatory {
    public Observatory(ArrayList<AstroShorty> stuff, Planet location){
        this.stuff = stuff;
        this.telescope = new Telescope(location);

    }
    String name;
    ArrayList<AstroShorty> stuff = new ArrayList<>();
    Telescope telescope;
    class Telescope{
        public Telescope(SpaceObject direction){
            this.direction = direction;
        }
        SpaceObject direction;
        int getSpeed(){
            return direction.speed;
        }
        int getWeight(){
            return direction.weight;
        }
        Location getLocation(){return direction.location;}
    }

}
