package entities;

import java.util.ArrayList;
import interfaces.*;



public class SpaceShip extends SpaceObject implements Movable {
    ArrayList<Plant> content = new ArrayList<Plant>();
    /*
    enum Shorties {
        NEZNAIKA(new entities.AstroShorty("Neznaika")),
        ZNAIKA(new entities.AstroShorty("Znaika")),
        VINTIK(new entities.PoliceShorty("Vintik")),
        SHPUNTIK(new entities.AstroShorty("Shpuntik")),
        ;
        //String name;
        entities.Shorty shorty;

        entities.Shorty getShorty() {
            return shorty;
        }

        Shorties(entities.Shorty shorty) {
            //this.name = name;
            this.shorty = shorty;
        }
    }
    */
    ArrayList<Shorty> crew = new ArrayList<Shorty>();

    public SpaceShip(String name, ArrayList<Shorty> shorties, ArrayList<Plant> seeds) {
        super(name, 0, 0);
        this.crew = shorties;
        this.content = seeds;
    }

    public void move(Planet target) {
        if (this.speed >= target.outSpeed) {
            this.position = target.position;
            System.out.println(this.name + " Successfully came to planet " + target.name);
        } else {
            System.out.println(this.name + "Cannot move to target" + target.name + " not enough speed");
        }
    }

    @Override
    public String toString() {
        return "SpaceShip " + name +
                " at Position " + position;
    }

    public String crew() {
        String crewstr = "";
        for (Shorty person : crew) {
            crewstr += person.toString() + "\n";
        }
        return crewstr;
    }

    public void getSpeed(int extraSpeed) {
        this.speed += extraSpeed;
        System.out.println("Space ship " + name + " got extra speed " + extraSpeed);
    }
    /*
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){

            SpaceShip sub = (SpaceShip) obj;
            return content == sub.content && crew == sub.crew;
        }
        return false;
    }*/
    /*
    @Override
    public boolean equals(Object obj){
        return false;
    }
    */

    @Override
    public int hashCode() {
        return 0;
        //return super.hashCode() + crew.hashCode() + content.hashCode();
    }
}
