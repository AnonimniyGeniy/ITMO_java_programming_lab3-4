import entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Policeman abc = new Policeman();
        System.out.println("---------------");

        ArrayList<Shorty> crew = new ArrayList<Shorty>();
        ArrayList<Plant> plants = new ArrayList<Plant>();
        crew.add(new AstroShorty("Neznaika"));
        crew.add(new AstroShorty("Znaika"));
        crew.add(new AstroShorty("Vintik"));
        crew.add(new PoliceShorty("Shpuntik"));
        plants.add(new Plant("Melon", 5, "melons"));
        plants.add(new Plant("Pumpkin", 3, "pumpkins"));
        plants.add(new Plant("tomato", 2, "berries"));
        SpaceShip ship = new SpaceShip("Ship 1", crew, plants);
        /*
        SpaceShip ship1 = new SpaceShip("Ship 2", crew, plants);
        SpaceShip ship3 = new SpaceShip("Ship 1", crew, plants);
        HashSet<SpaceShip> myset = new HashSet<>();
        myset.add(ship);
        myset.add(ship1);

        System.out.println(myset.contains(ship));
        System.out.println(myset.contains(ship1));
        System.out.println(myset.contains(ship3));
        myset.add(ship3);
        System.out.println(myset.contains(ship));
        System.out.println(myset.contains(ship1));
        System.out.println(myset.contains(ship3));
        //System.out.println(ship);
        //System.out.println(ship.Crew());
        */

        Planet earth = new Planet("Earth", 10000, 0, 0);
        Planet moon = new Planet("moon", 3000, 5000, 500);
        ship.getSpeed(10000);
        AstroShorty davilonskiyAstronom = new AstroShorty("Davilonskiy Astronom");
        davilonskiyAstronom.astro.getPosition(ship);
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

        ship.move(moon);

    }

}