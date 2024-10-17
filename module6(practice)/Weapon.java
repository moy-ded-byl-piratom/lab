public class Weapon implements IPrototype{
    public String name;
    public int damage;
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }

    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }

    @Override
    public Weapon Clone() {
        return new Weapon(this.name,this.damage);
    }
}
