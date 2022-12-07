package entities;

import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public abstract class Shorty {

    String name;

    //entities.Profession profession;
    public void Call(Shorty companion, String speech, SpeechSpeed speed) {
        SpeechSpeed sp = speed;
        switch (speed) {
            case MEDLENNO -> {
                Timer countdown = new Timer(1000, null);
                countdown.setRepeats(false);
                countdown.start();
                break;
            }
            case NEMEDLENNO -> {
                break;
            }
        }
        System.out.println(name + " said: " + speech);
    }

    public Shorty(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Shorty sub = (Shorty) obj;
        return name == sub.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
