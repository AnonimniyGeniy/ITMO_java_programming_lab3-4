package entities;

public abstract class Profession {
    public Profession(String name) {
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
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Profession sub = (Profession) obj;
        return name.equals(sub.name);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 13;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
