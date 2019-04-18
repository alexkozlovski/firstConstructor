package SecondTry.Source_Code.OOD.Lessons11_Flyweight;

/**
 * Created by user on 04.11.2018.
 */
public class Terrorist implements Player {
    private static final String MISSION="Plant a bomb";
    private String weapon;
    @Override
    public void setWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void showInformation() {
        System.out.printf("Player \"Terrorist\" added. Weapon:%s. Mission:%s.%n",weapon,MISSION);
    }
}
