public class SpaceShip extends SpaceObject implements Movable{
    Plant [] Content = new Plant[6];

    enum Shorties {
        NEZNAIKA(new AstroShorty("Neznaika")),
        ZNAIKA(new AstroShorty("Znaika")),
        VINTIK(new PoliceShorty("Vintik")),
        SHPUNTIK(new AstroShorty("Shpuntik")),

        ;
        //String name;
        Shorty shorty;
        /*String getName()
        {
            return name;
        }*/

        Shorty getShorty()

        {
            return shorty;
        }

        Shorties(Shorty shorty) {
            //this.name = name;
            this.shorty = shorty;
        }
    }
    public SpaceShip(String Name){
        super(Name, 0, 0);

        this.Content[0] = new Plant("Watermelon", 5, "Berry");
        this.Content[1] = new Plant("Potato", 3, "Vegetable");
        this.Content[2] = new Plant("Tomato", 4, "Berry");
        this.Content[3] = new Plant("Salad", 2, "Salad");
        this.Content[4] = new Plant("Pumpkin", 4, "Pumpkins");
        this.Content[5] = new Plant("Marrow", 3, "Pumpkins");
    }
    public void Move(Planet target){
        if (this.Speed >= target.OutSpeed){
            this.Position = target.Position;
            System.out.println(this.Name + " Successfully came to planet " + target.Name);
        }
        else{
            System.out.println(this.Name + "Cannot move to target" + target.Name + " not enough speed");
        }
    }

    @Override
    public String toString() {
        return "SpaceShip " + Name +
                " at Position " + Position;
    }
    public String Crew(){
        String crew = "";
        for(int i = 0; i < Shorties.values().length; i++){
            crew += Shorties.values()[i].shorty.toString() + "\n" ;
        }
        return crew;
    }
    public void GetSpeed(int ExtraSpeed){
        this.Speed += ExtraSpeed;
        System.out.println("Space ship " + Name + " got extra speed " + ExtraSpeed);
    }
}
