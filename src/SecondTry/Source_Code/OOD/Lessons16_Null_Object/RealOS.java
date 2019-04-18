package SecondTry.Source_Code.OOD.Lessons16_Null_Object;

/**
 * Created by user on 14.11.2018.
 */
public class RealOS  extends AbstractOS{
    public RealOS(String title){
        this.title=title;
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
