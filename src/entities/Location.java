package entities;

public class Location {
    public int x;
    public int y;
    public int z;

    public Location(SpaceObject parent) {
        this.x = parent.location.x;
        this.y = parent.location.y;
        this.z = parent.location.z;
    }

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int Distance(Location obj) {
        class RelativeCoordinates {
            final int rx;
            final int ry;
            final int rz;

            public RelativeCoordinates(int x, int y, int z, Location obj) {
                this.rx = x - obj.x;
                this.ry = y - obj.y;
                this.rz = z - obj.z;
            }

            int getVectorLength() {
                return (int) Math.round(Math.sqrt(rx * rx + ry * ry + rz * rz));
            }
        }
        RelativeCoordinates coordinates = new RelativeCoordinates(x, y, z, obj);
        return coordinates.getVectorLength();
    }

    @Override
    public String toString() {
        return " x = " + x + "; y = " + y + "; z = " + z + " ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Location sub = (Location) obj;

        return super.equals(obj) && sub.x == this.x && sub.y == this.y && sub.z == this.z;
    }

    @Override
    public int hashCode() {
        return x * 131 + y * 149 + z * 173;
    }
}
