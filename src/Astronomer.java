public class Astronomer extends Profession implements Observe {
    public Astronomer() {
        super("Astronomer");
    }

    public int GetPosition(SpaceObject object) {
        System.out.println("Position of " + object.Name + " is " + object.Position);
        return object.Position;
    }

    public int GetSpeed(SpaceObject object) {
        System.out.println("Speed of " + object.Name + " is " + object.Speed);

        return object.Speed;
    }

    @Override
    public String toString() {
        return Name;
    }

    @Override
    public boolean equals(Object o){
        if(this.getClass() == o.getClass()){
            return true;
        }
        else{
            return false;
        }
    }
}
