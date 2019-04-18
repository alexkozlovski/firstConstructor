package SecondTry.Source_Code.OOD.Lessons9_Facade;

/**
 * Created by user on 04.11.2018.
 */
public class Description implements Element {
    private  String description;

    public Description(String description) {
        this.description = description;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd description :[%s]",description);
    }
}
