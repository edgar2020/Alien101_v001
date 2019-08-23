import java.math.*;
public class Klingon extends Enemy
{
    boolean isFriendly=false;

    public Klingon()
    {
        super("John Doe", "Blade", 2, 100);
        this.isFriendly = isFriendly;
    }

    public Klingon(String Name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(Name, weapon, lives, health);
        this.isFriendly = isFriendly;
    }//end full constructor

    public boolean isFriendly()
    {
        return isFriendly;
    }

    public void setFriendly(boolean friendly)
    {
        isFriendly = friendly;
    }

    public void Attack(int damage)
    {
        if(!isFriendly)
            if(Math.random()<0.5)
                health-=damage;
    }

    public int getHealth()
    {
        return health;
    }

    @Override
    public String toString()
    {
        return "Klingon{" +
                "isFriendly=" + isFriendly +
                ", lives=" + lives +
                ", health=" + health +
                ", Name='" + Name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }//end toString
}
