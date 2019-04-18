package SecondTry.Source_Code.OOD.Lessons16_Null_Object;

/**
 * Created by user on 14.11.2018.
 */
public class NullOS extends AbstractOS {
    @Override
    public String getTitle() {
        return "Not supported";
    }

    @Override
    public boolean isNull() {
        return true ;
    }
}
