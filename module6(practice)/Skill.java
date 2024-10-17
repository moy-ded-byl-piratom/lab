public class Skill implements  IPrototype{
    public String name;
    public String type;
    public void Skill(String name, String type){
        this.name=name;
        this.type=type;
    }
    @Override
    public Skill Clone() {
        return new Skill(this.name,this.type);
    }
}

