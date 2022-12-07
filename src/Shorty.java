public abstract class Shorty {

    String Name;
    //Profession profession;
    void Call(Shorty companion, String speech){
        System.out.println(Name + " said: " + speech);
    }
    public Shorty(String name){
        this.Name = name;
    }

    @Override
    public String toString() {
        return Name +" ";
    }
}
