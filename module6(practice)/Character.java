import java.util.ArrayList;
public class Character implements IPrototype<Character>{
    public String name;
    public int health;
    public int intellect;
    public int agility;
    private Weapon weapon;
    private Armor armor;
    private ArrayList<Skill> skills = new ArrayList<>();
    public Character(String name, int health,int intellect, int agility ){
        this.name = name;
        this.health = health;
        this.intellect = intellect;
        this.agility = agility;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setIntellect(int intellect){
        this.intellect = intellect;
    }
    public void setAgility(int agility){
        this.agility = agility;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getIntellect(){
        return intellect;
    }
    public int getAgility(){
        return  agility;
    }
    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public Character Clone() {
        Character clonedCharacter = new Character(this.name, this.health, this.intellect, this.agility);
        clonedCharacter.setWeapon(this.weapon.Clone());
        clonedCharacter.setArmor(this.armor.Clone());

        ArrayList<Skill> clonedSkills = new ArrayList<>();
        for (Skill skill : this.skills) {
            clonedSkills.add(skill.Clone());
        }
        clonedCharacter.skills = clonedSkills;

        return clonedCharacter;
    }
}
