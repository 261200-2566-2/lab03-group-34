public class Fighter {
    String name;
    private int lvl;
    private double maxHP = 100;
    private double currentHP;
    private double maxMana = 50;
    private double currentMana;
    private double baseSpeed = 20;
    private double Speed;
    private double currentSpeed;
    Sword equipSword;
    Shield equipShield;

    public Fighter(String name, Sword sword, Shield shield){
        this.lvl = lvl;
        this.equipSword = sword;
        this.equipShield = shield;
        initializeStats();
    }
    public void initializeStats(){
        maxHP = 100 + 10*lvl;
        maxMana = 50 + 2*lvl;
        baseSpeed = 10 + 3*lvl;
        currentHP = maxHP;
        currentMana = maxMana;
        currentSpeed = baseSpeed;
        updateStats();
    }
    public void takeDMG(int damage){
        int reducedDMG = (int) (damage - equipShield.shieldDEF);
        reducedDMG = Math.max(reducedDMG, 0);
        currentHP -= reducedDMG;
        currentHP = Math.max(currentHP, 0); // check if HP < 0 to set HP = 0
    }
    public void lvlUP(){
        lvl++;
        initializeStats();
    }
    public void setEquipSword(Sword newSword){
        equipSword = newSword;
        updateStats();
    }
    public void setEquipShield(Shield newShield){
        equipShield = newShield;
    }
    public void updateStats(){
        currentSpeed = baseSpeed - equipSword.SpeedDecrease() - equipShield.SpeedDecrease();
    }
    public double getMaxHP(){
        System.out.println("Your maxHP is " + maxHP);
        return 0;
    }
    public double getMaxMana(){
        System.out.println("Your maxMana is " + maxMana);
        return 0;
    }
    public double getCurrentHP(){
        System.out.println("Your currentHP is " + currentHP);
        return 0;
    }
    public double getCurrentMana(){
        System.out.println("Your currentMana is " + currentMana );
        return 0;
    }
    public double getCurrentSpeed(){
        System.out.println("Your currentSpeed is " + currentSpeed);
        return 0;
    }

}

