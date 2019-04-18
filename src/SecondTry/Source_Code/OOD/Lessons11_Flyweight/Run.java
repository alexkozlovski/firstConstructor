package SecondTry.Source_Code.OOD.Lessons11_Flyweight;

import java.util.Random;

/**
 * Created by user on 04.11.2018.
 */
public class Run {
    private static final String[] PLAYER=
            {"Terrorist","Counter-Terrorist"};
    private static final String[] TWEAPON=
            {"Glock","Desert Eagle","AK-47","AWP","Dual Berettas"};
    private static final String[] CTWEAPON=
            {"USP","Desert Eagle","M4A4","Famas","AWP"};

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <10 ; i++) {
            Player player=PlayersFactory.getPlayer(getRandomPlayer());
            player.setWeapon(getRandomWeapon(player));
            player.showInformation();
        }
        for (int i = 5; i >=0 ; i--) {
            if(i==0) System.out.println("GO! GO! GO!");
            else System.out.printf("Round restart after %d sec...%n",i);
            Thread.sleep(1000);
        }

    }


    private static String getRandomPlayer(){
        Random random=new Random();
        int randomPlayer=random.nextInt(PLAYER.length);
        return PLAYER[randomPlayer];
    }
    private static String getRandomWeapon(Player player){
        Random random=new Random();
        int randomWeapon;
        String weapon=null;
        if(player instanceof Terrorist){
             randomWeapon=random.nextInt(TWEAPON.length);
            weapon= TWEAPON[randomWeapon];
        }
        if(player instanceof CounterTerrorist){
             randomWeapon=random.nextInt(CTWEAPON.length);
            weapon= CTWEAPON[randomWeapon];
        }
        return weapon;

    }
}
