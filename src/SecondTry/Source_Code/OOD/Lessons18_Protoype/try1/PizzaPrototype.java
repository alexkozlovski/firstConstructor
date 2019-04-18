package SecondTry.Source_Code.OOD.Lessons18_Protoype.try1;

/**
 * Created by user on 15.11.2018.
 */
public interface PizzaPrototype extends Cloneable {
    PizzaPrototype make() throws CloneNotSupportedException;
}
