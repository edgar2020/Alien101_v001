public class Fighter implements Actor
{
    int level=0,xp=0;
    int lives=0, health=0;
    final int NUMLIVES=3;
    String rank="";
    String Name="",weapon="";
     //constructors
     public Fighter()
     {
         level=0;
         xp=0;
         lives=0;
         health=0;
         rank="N/A";
         Name="John Joe";
         weapon="N/A";
     }


    public Fighter(String rank, int level, int xp)
    {
        this.rank = rank;
        this.level = level;
        this.xp = xp;
    }

    public int getHealth()
    {

        return health;
    }

    public String getRank()
    {
        return rank;
    }//end of rank getter

    public Fighter(String rank, int level, int xp, int lives, int health , String name, String weapon)
    {
        this.level = level;
        this.xp = xp;
        this.lives = lives;
        this.health = health;
        this.rank = rank;
        Name = name;
        this.weapon = weapon;
    }

    public Fighter(String rank, String Name, String weapons, int level, int xp)
    {
        this.rank=rank;
        this.Name=Name;
        lives=NUMLIVES;
        this.level=level;
        this.xp=xp;
    }
    @Override
    public void Attack(int damage)
    {
        int[] power = {10,20,30,40,50,10,2,6,100,4,15,120};
        health-=(int)(Math.random()* power.length);
    }//end of attack method for fighter

    public String getName()
    {
        return Name;
    }//end of name getter

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getLives()
    {
        return lives;
    }
    public String getTitle()
    {
        return rank+" "+name;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getNUMLIVES()
    {
        return NUMLIVES;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
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

    @Override
    public String toString()
    {
        return "Fighter:\n\t"+rank+"\n\t"+level+"\n\t"+xp;
    }
    //toString
}//end of fighter class
