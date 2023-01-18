package entities;

public class NotEnoughDeltaVException extends Exception {
    private final int DeltaV;
    private final int AddedSpeed;

    public int getDeltaV() {
        return DeltaV;
    }

    public int getAddedSpeed() {
        return AddedSpeed;
    }

    public NotEnoughDeltaVException(String message, int deltaVelocity, int extraSpeed) {
        super(message);
        DeltaV = deltaVelocity;
        AddedSpeed = extraSpeed;
    }

}
