public class Shield {
    public int lvl = 1;
    public double baseDEF;
    public double shieldDEF;
    public Shield(double baseDEF){
        this.baseDEF = baseDEF;
        shieldDEF = baseDEF;
    }
    public void shieldStats(){
        System.out.println("Level: " + lvl + "DEF: " + shieldDEF);
    }
    public int SpeedDecrease(){
        return (int)(10 * (0.1 + 0.08 * lvl));
    }
    public void lvlUP(){
        lvl++;
        shieldDEF = baseDEF*(1 + 0.05*lvl);
        System.out.println("Congrat! your shield is level UP!!");
    }
}
