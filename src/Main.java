import entities.*;

import java.util.ArrayList;
/*
interface Add {
    int add(int a, int b);
}*/


public class Main {
    static class Space {
        static final ArrayList<SpaceObject> planets = new ArrayList<>();
        static final ArrayList<SpaceObject> ships = new ArrayList<>();
        static final ArrayList<SpaceObject> other = new ArrayList<>();

    }

    public static void main(String[] args) {
        /*
        Add k;
        k = (a,b) -> {return a + b;};
        int res = k.add(1,2);*/

        Planet earth = new Planet("Earth", 10000, 0, 500000000, 0, 0, 0);
        Planet moon = new Planet("moon", 3000, 500, 700000, 10000, 10000, 1000);


        Space.other.add(new SpaceObject("meteor 1", 300, 100, new Location(earth)));
        Space.other.add(new SpaceObject("meteor 2", 200, 230, new Location(earth)));

        SpaceShip ship = new SpaceShip("Ship 1", earth, 3000);
        //SpaceShip ship = new SpaceShip("Ship1", new ArrayList<Shorty>(), new ArrayList<Plant>(), earth, 10000);

        Space.ships.add(ship);
        Space.planets.add(earth);
        Space.planets.add(moon);

        AstroShorty davilonskiyAstronom = new AstroShorty("Davilonskiy Astronom");
        ArrayList<AstroShorty> obsStuff = new ArrayList<>();

        obsStuff.add(davilonskiyAstronom);
        Observatory observatory = new Observatory(obsStuff, moon) {
            public String getStuff() {
                String ans = "";
                for (Shorty shorty : obsStuff) {
                    ans += shorty.toString();
                }
                return ans;
            }
        };
        observatory.locateTelescope(earth);
        observatory.getObjects(Space.other);
        observatory.getObjects(Space.ships);
        System.out.println();
        try {
            ship.getSpeed(10000);
        } catch (NotEnoughDeltaVException e) {
            System.out.println("Exception: not enough DeltaV to get required speed ");
            System.out.println("Added speed: " + e.getAddedSpeed());
            System.out.println("DeltaVelocity: " + e.getDeltaV());
        }

        davilonskiyAstronom.astro.getLocation(ship);
        int speed = davilonskiyAstronom.astro.getSpeed(ship);
        PoliceShorty Rzhigl = new PoliceShorty("Rzhigl");
        PoliceShorty Spruts = new PoliceShorty("Spruts");
        SpeechSpeed sp;
        double a = Math.random();
        if (a > 0.5) {
            sp = SpeechSpeed.MEDLENNO;
        } else {
            sp = SpeechSpeed.NEMEDLENNO;
        }
        //davilonskiyAstronom.astro.GetSpeed(ship);
        if (davilonskiyAstronom.astro.checkTrajectory(ship, moon)) {
            System.out.println("Space ship have enough speed to reach moon");


            davilonskiyAstronom.Call(Spruts, "Space ship got enough speed to get out from Earth's gravity field.", sp);
            Spruts.Call(davilonskiyAstronom, "Continue observation.", sp);
            Spruts.Call(Rzhigl, "Space ship with giant seeds coming to moon ", sp);
            Rzhigl.Call(Spruts, "All required countermeasures will be accepted.", sp);
        } else {
            System.out.println("Space ship haven't enough speed to reach moon");
            davilonskiyAstronom.Call(Spruts, "Space ship have not enough speed to get out from Earth's gravity field.", sp);
        }


        ship.location = new Location((ship.location.x + moon.location.x) / 2, (ship.location.y + moon.location.y) / 2 + 2000, (ship.location.z + moon.location.x) / 2);
        System.out.println("Ship missed trajectory and mistake is 2000 points at y axis");

        ship.move(moon);
        observatory.locateTelescope(ship);
        //observatory.getWeight();
        observatory.getSpeed();
        System.out.println("Astronomers concluded that on space ship can be up to " + (observatory.getWeight() / 3) + " Shorties");
        observatory.getLocation();
        for (SpaceObject planet : Space.planets) {
            if (planet.location.Distance(ship.location) < 2000) {
                System.out.println("Astronomers coucluded that Ship is close to the planet " + planet.name);
            }
        }
        System.out.println("Astronomers concluded that space ship is choosing place to land");
    }

}