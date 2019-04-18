package SecondTry.Source_Code.OOD.Lessons16_Null_Object.try1;

/**
 * Created by user on 15.11.2018.
 */
public class RealOS extends AbstractOS {
    private String title;

    public RealOS(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
