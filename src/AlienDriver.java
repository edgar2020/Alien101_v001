public class AlienDriver
{
    public static void main(String[] args)
    {
        Fighter Joe = new Fighter("Capt.", 29, 234452, 5, 100, "Joe", "blaster");
        Creeper creepie = new Creeper("Creepie", "TNT",1, 20, true);
        Klingon worf= new Klingon("Worf", "Phasor", 1, 1000, true);
        Klingon Burgog= new Klingon("Burgog", "Bat'leth", 1, 1000, false);

        int[] numArray={5,6,7,8,3,23};
        Actor[] cast = {creepie,worf,Burgog,Joe};
        for(Actor e:cast)
            System.out.println(e);

        creepie.Attack(10);
        Joe.Attack(20);
        worf.Attack(20);
        Burgog.Attack(15);

        System.out.println("Creepie: "+creepie.getHealth());
        System.out.println(Joe.getRank()+" "+ Joe.getName()+": "+Joe.getHealth());
        System.out.println("Burgog: "+Burgog.getHealth());
        System.out.println("Worf: "+worf.getHealth());

        Joe.setHealth(Joe.getHealth()+50);
        System.out.println(Joe.getTitle() +" gained a health pack, health is now "+ Joe.getHealth());

    }//end of main
}//end of Alien Driver
