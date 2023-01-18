package entities;

import java.util.ArrayList;

public class DavilonObsrevatory {
    public DavilonObsrevatory(){


    }
    String name;
    ArrayList<AstroShorty> stuff = new ArrayList<>();
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
    }
}
