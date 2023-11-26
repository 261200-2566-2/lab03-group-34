public class Sword {
    public int lvl = 1;
    public double baseDMG;
    public double swordDMG;

    public Sword(double baseDMG){
        this.baseDMG = baseDMG;
        swordDMG = baseDMG;
    }
    public int SpeedDecrease(){
        return (int)(10 * (0.1 + 0.04 * lvl));
    }
    public void lvlUP(){
        lvl++;
        swordDMG = baseDMG*(1 + 0.1*lvl);
        System.out.println("Congrat! your sword is level UP!!");
    }
}
