package entities;

public class Location {
    int x;
    int y;
    int z;

    public Location(SpaceObject parent){
        this.x = parent.location.x;
        this.y = parent.location.y;
        this.z = parent.location.z;
    }

    public Location(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    long Distance(Location obj){
        int dx = x - obj.x;
        int dy = y - obj.y;
        int dz = z - obj.z;
        return Math.round(Math.sqrt(dx*dx + dy*dy + dz*dz));
    }
    @Override
    public String toString(){
        String ans = " x = " + x + "; y = " + y + "; z = " + z + " ";
        return  ans;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Location sub = (Location) obj;

        return super.equals(obj) && sub.x == this.x && sub.y == this.y && sub.z == this.z;
    }

    @Override
    public int hashCode() {
        return x * 131  + y * 149 + z * 173;
    }
}
