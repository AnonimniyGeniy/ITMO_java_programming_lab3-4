package entities;

import java.util.Objects;

public abstract class Profession {
    public Profession(String name) {
        this.name = name;
    }

    String name;

    @Override
    public String toString() {
        return "entities.Profession{" +
                "Name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Profession sub = (Profession) obj;
        return name == sub.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
