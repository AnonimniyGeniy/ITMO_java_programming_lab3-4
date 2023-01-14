package entities;

import java.util.Objects;

public abstract class Profession {
    {
        System.out.println("Init block Profession called");
    }
    public Profession(String name) {
        System.out.println("Profession constructor called");
        this.name = name;
    }

    String name;

    @Override
    public String toString() {
        return "Profession{" +
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
        int prime = 31;
        int result = 13;
        result = prime * result + ((name  == null) ? 0 : name.hashCode());
        return result;
    }
}
