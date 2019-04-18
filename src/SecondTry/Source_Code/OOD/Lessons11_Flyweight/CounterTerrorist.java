package SecondTry.Source_Code.OOD.Lessons11_Flyweight;

/**
 * Created by user on 04.11.2018.
 */
public class CounterTerrorist implements Player {
    private static final String MISSION="Defuse the bomb";
    private String weapon;
    @Override
    public void setWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void showInformation() {
        System.out.printf("Player \"Counter-terrorist\" added. Weapon:%s. Mission:%s.%n",weapon,MISSION);
    }
}
