public class Main {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip("Ship 1");
        System.out.println(ship);
        //System.out.println(ship.Crew());
        Planet Earth = new Planet("Earth", 10000, 0, 0);
        Planet Moon = new Planet("Moon", 3000, 5000, 500);
        ship.GetSpeed(10000);
        AstroShorty DavilonAstro = new AstroShorty("Davilonskiy Astronom");
        DavilonAstro.astro.GetPosition(ship);
        int speed = DavilonAstro.astro.GetSpeed(ship);
        PoliceShorty Rzhigl = new PoliceShorty("Rzhigl");
        PoliceShorty Spruts = new PoliceShorty("Spruts");
        //DavilonAstro.astro.GetSpeed(ship);
        if(speed >= Earth.OutSpeed){
            System.out.println("Space ship have enough speed to reach moon");
            DavilonAstro.Call(Spruts, "Space ship got enough speed to get out from Earth's gravity field.");
            Spruts.Call(DavilonAstro, "Continue observation.");
            Spruts.Call(Rzhigl, "Space ship with giant seeds coming to moon ");
            Rzhigl.Call(Spruts, "All required countermeasures will be accepted.");

        }else{
            System.out.println("Space ship haven't enough speed to reach moon");
            DavilonAstro.Call(Spruts, "Space ship have not enough speed to get out from Earth's gravity field.");
        }

        ship.Move(Moon);
        
    }
}