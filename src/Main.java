public class Main {
    public static void main(String[] args) {
        // Create a sword and a shield
        Sword LongSword = new Sword(100);
        Shield HeavyShield = new Shield(50);

        // Create an RPG character with initial level and equipment
        Fighter Knack = new Fighter("Knack", LongSword, HeavyShield);

        // Display initial character stats
        displayCharacterStats(Knack);

        // Simulate a level up
        Knack.lvlUP();
        System.out.println("\nLevel up!");
        displayCharacterStats(Knack);

        // Simulate equipping a new sword and shield
        Sword newSword = new Sword(500);
        Shield newShield = new Shield(1000);

        Knack.setEquipSword(newSword);
        Knack.setEquipShield(newShield);

        System.out.println("\nEquipped new sword and shield:");
        displayCharacterStats(Knack);

        // Simulate taking damage
        int damageTaken = 2000;
        Knack.takeDMG(damageTaken);

        System.out.println("\nAfter taking damage:");
        displayCharacterStats(Knack);
    }

    private static void displayCharacterStats(Fighter character) {
        System.out.println("\nCharacter Stats:");
        System.out.println("Max HP: " + character.getMaxHP());
        System.out.println("Max Mana: " + character.getMaxMana());
        System.out.println("Current HP: " + character.getCurrentHP());
        System.out.println("Current Mana: " + character.getCurrentMana());
        System.out.println("Current Run Speed: " + character.getCurrentSpeed());
        System.out.println("--------------------------------------------------");
        System.out.println("Equipment Stats:");
        System.out.println("SwordDMG: " + character.equipSword.swordDMG);
        System.out.println("ShieldDEF: " + character.equipShield.shieldDEF);
        System.out.println("--------------------------------------------------");
        if(character.getCurrentHP() == 0){
            System.out.println("You're dead ");
        }
    }
}
