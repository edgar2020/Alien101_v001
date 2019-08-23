public class Creeper extends Enemy
{
    boolean isAggresive = true;

    public Creeper(String Name, String weapon, int lives, int health, boolean isAggresive)
    {
        super(Name, weapon, lives, health);
        this.isAggresive = isAggresive;
    }//end full constructor'public Creeper(String Name, String weapon, int lives, int health, boolean isAggresive)
    public Creeper()
    {
        super("Bomby", "explosive", 1, 20);
        this.isAggresive = isAggresive;
    }//end 0 arg constructor

    public boolean isAggresive()
    {
        return isAggresive;
    }

    public void setAggresive(boolean aggresive)
    {
        isAggresive = aggresive;
    }

    @Override
    public void Attack(int damage)
    {
        if(isAggresive);
            health-=damage;
    }

    @Override
    public int getHealth()
    {
        return super.getHealth();
    }

    public String toString()
    {
        return "Creeper{" +
                "isAggresive=" + isAggresive +
                ", lives=" + lives +
                ", health=" + health +
                ", Name='" + Name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}//end class
