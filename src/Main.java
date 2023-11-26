public class Main {
    public static void main(String[] args) {
        Sword LongSword = new Sword(100.00);
        Shield HeavyShield = new Shield(200.00);
        Fighter Knack = new Fighter("Knack", LongSword, HeavyShield);
        displayStatus(Knack);

        Sword ShortSword = new Sword(50.00);
        Shield LightShield = new Shield(100);
        Fighter Natan = new Fighter("Natan", ShortSword, LightShield);
        displayStatus(Natan);
    }
    public static void displayStatus(Fighter fighter){
        System.out.println("-----Figther Status-----");
        System.out.println("Name: " + fighter.getName());
        System.out.println("Level: " + fighter.getLevel());
        System.out.println("HP: " + fighter.getCurrentHP() + "/" + fighter.getMaxHP());
        System.out.println("Mana: " + fighter.getCurrentMana() + "/" + fighter.getMaxMana());
        System.out.println("Speed: " + fighter.getCurrentSpeed());
    }
}