package interfaces;

import entities.Location;
import entities.SpaceObject;

public interface Observe {
    Location getLocation(SpaceObject object);

    int getSpeed(SpaceObject object);
}
