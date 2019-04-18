package SecondTry.Source_Code.OOD.Lessons18_Protoype;

/**
 * Created by user on 15.11.2018.
 */
public interface Pizza extends Cloneable {
    Pizza make() throws CloneNotSupportedException;
}
