package entities;

import java.util.Objects;

public class Plant {
    String name;
    int size;
    String type;

    public Plant(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "entities.Plant{" +
                "Name='" + name + '\'' +
                ", Size=" + size +
                ", Type='" + type + '\'' +
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
        Plant sub = (Plant) obj;
        return size == sub.size  && name == sub.name && type == sub.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name, type);
    }
}
