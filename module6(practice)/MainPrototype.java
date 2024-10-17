public class MainPrototype {
    public static void main(String[] args) {
        // Создаем оригинального персонажа
        Character originalCharacter = new Character("Warrior", 100, 50, 30);
        originalCharacter.setWeapon(new Weapon("Sword", 25));
        originalCharacter.setArmor(new Armor("Steel Armor", 50));
        originalCharacter.addSkill(new Skill("Slash", "Physical"));
        originalCharacter.addSkill(new Skill("Fireball", "Magical"));

        // Клонируем персонажа
        Character clonedCharacter = originalCharacter.Clone();
        clonedCharacter.setName("Cloned Warrior");

        // Изменяем данные клона
        clonedCharacter.getWeapon().setName("Axe");
        clonedCharacter.getWeapon().setDamage(30);

        // Выводим информацию о персонажах
        System.out.println("Original Character:");
        printCharacter(originalCharacter);
        System.out.println("\nCloned Character:");
        printCharacter(clonedCharacter);
    }

    private static void printCharacter(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Health: " + character.getHealth());
        System.out.println("Intellect: " + character.getIntellect());
        System.out.println("Agility: " + character.getAgility());
        System.out.println("Weapon: " + character.getWeapon().getName() + " (Damage: " + character.getWeapon().getDamage() + ")");
        System.out.println("Armor: " + character.getArmor().getName() + " (Defense: " + character.getArmor().getDefense() + ")");
        System.out.println("Skills:");
        for (Skill skill : character.getSkills()) {
            System.out.println("- " + skill.getName() + " (" + skill.getType() + ")");
        }
    }
}

