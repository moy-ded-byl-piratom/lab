public class Armor implements IPrototype{
    public String name;
    public int defense;
    public Armor(String name, int defense){
        this.name = name;
        this.defense = defense;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }

    public String getName(){
        return name;
    }
    public int getDefense(){
        return defense;
    }


    @Override
    public Armor Clone() {
        return new Armor(this.name,this.defense);
    }
}
