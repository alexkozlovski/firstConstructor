package SecondTry.Source_Code.OOD.Lessons18_Protoype;

/**
 * Created by user on 15.11.2018.
 */
public class Run {
    public static void main(String[] args)throws CloneNotSupportedException {
        ConcretePizza cheesePizza=new ConcretePizza();
        cheesePizza.setSize("XL");
        cheesePizza.setSauce("BBQ");
        cheesePizza.setCheese("Mozzarella, Parmesan");
        System.out.println(cheesePizza.getInfo());

        ConcretePizza mushroomsPizza=(ConcretePizza) cheesePizza.make();
        mushroomsPizza.setMushrooms("Champignons");
        System.out.println(mushroomsPizza.getInfo());

        ConcretePizza sausagesPizza=(ConcretePizza) mushroomsPizza.make();
        sausagesPizza.setSausages("Bavarian sausages");
        System.out.println(sausagesPizza.getInfo());
    }
}
