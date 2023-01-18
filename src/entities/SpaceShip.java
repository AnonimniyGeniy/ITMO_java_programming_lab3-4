package entities;

import java.util.ArrayList;

import interfaces.*;


public class SpaceShip extends SpaceObject implements Movable {
    ArrayList<Plant> content = new ArrayList<Plant>();
    int deltaVelocity;
    ArrayList<Shorty> crew = new ArrayList<Shorty>();

    public SpaceShip(String name, ArrayList<Shorty> shorties, ArrayList<Plant> seeds, Planet origin, int DV) {
        super(name, 0, 90, origin.location);
        if (crew.size() == 0){
            throw new NoCrewException();
        }
        this.crew = shorties;
        this.content = seeds;
        this.deltaVelocity = DV;
    }

    public SpaceShip(String name, Planet origin, int DV) {
        super(name, 0, 100, origin.location);
        ArrayList<Plant> plants = new ArrayList<Plant>();
        plants.add(new Plant("Melon", 5, "melons"));
        plants.add(new Plant("Pumpkin", 3, "pumpkins"));
        plants.add(new Plant("tomato", 2, "berries"));

        ArrayList<Shorty> crew = new ArrayList<Shorty>();
        crew.add(new AstroShorty("Neznaika"));
        crew.add(new AstroShorty("Znaika"));
        crew.add(new AstroShorty("Vintik"));
        crew.add(new PoliceShorty("Shpuntik"));

        this.crew = crew;
        this.content = plants;
        this.deltaVelocity = DV;
    }

    public void move(Planet target) {

        if (this.speed >= target.outSpeed) {
            this.location = target.location;
            System.out.println(this.name + " Successfully came to planet " + target.name);
        } else {
            System.out.println(this.name + "Cannot move to target" + target.name + " not enough speed");
        }
    }

    @Override
    public String toString() {
        return "SpaceShip " + name +
                " at Location " + location;
    }

    public String crew() {
        String crewstr = "";
        for (Shorty person : crew) {
            crewstr += person.toString() + "\n";
        }
        return crewstr;
    }

    public void getSpeed(int extraSpeed) throws NotEnoughDeltaVException{
        if (deltaVelocity < extraSpeed) throw new NotEnoughDeltaVException("Not enough DeltaV to get speed", deltaVelocity, extraSpeed);
        this.speed += extraSpeed;
        this.deltaVelocity -= extraSpeed;
        System.out.println("Space ship " + name + " got extra speed " + extraSpeed + " AND spent some inner energy...");
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {

            SpaceShip sub = (SpaceShip) obj;
            return content == sub.content && crew == sub.crew;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + crew.hashCode() + content.hashCode();
    }
}


class NoCrewException extends RuntimeException{
    public NoCrewException(){
        super("No crew in ship");
    }
}
