package entities;

import java.util.Objects;


public abstract class Shorty {

    String name;

    //entities.Profession profession;
    public void Call(Shorty companion, String speech, SpeechSpeed speed) {
        SpeechSpeed sp = speed;
        switch (speed) {
            case MEDLENNO -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //
                }
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
        int prime = 31;
        int result = 47;
        result = prime * result + ((name  == null) ? 0 : name.hashCode());
        return result;
    }
}
