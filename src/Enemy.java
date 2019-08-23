public abstract class Enemy implements Actor
{
    int lives=0, health=0;
    String Name="",weapon="";



    public Enemy()
    {
        Name= "bblob";
        weapon="name";
    }

    public int getLives()
    {
        return lives;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public Enemy(String Name, String weapon, int lives, int health)
    {
        this.Name=Name;
        this.weapon="photon blaster";
        this.lives=lives;
        this.health=health;

    }

    public String getName()
    {
        return Name;
    }

    public int getHealth()
    {
        return health;
    }

    @Override
    public String toString()
    {
        return "Enemy{" +
                "lives=" + lives +
                ", health=" + health +
                ", Name='" + Name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
