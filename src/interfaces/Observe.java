package interfaces;

import entities.SpaceObject;

public interface Observe {
    int getPosition(SpaceObject object);

    int getSpeed(SpaceObject object);
}
