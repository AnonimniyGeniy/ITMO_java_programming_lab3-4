import entities.*;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(ship);
        //System.out.println(ship.Crew());
        Planet earth = new Planet("Earth", 10000, 0, 0);
        Planet moon = new Planet("moon", 3000, 5000, 500);
        ship.getSpeed(10000);
        AstroShorty davilonskiyAstronom = new AstroShorty("Davilonskiy Astronom");
        davilonskiyAstronom.astro.getPosition(ship);
        int speed = davilonskiyAstronom.astro.getSpeed(ship);
        PoliceShorty Rzhigl = new PoliceShorty("Rzhigl");
        PoliceShorty Spruts = new PoliceShorty("Spruts");
        SpeechSpeed sp = SpeechSpeed.MEDLENNO;
        int a = new Random().nextInt();
        if (a >= 1000){
            sp = SpeechSpeed.MEDLENNO;
        }else{
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