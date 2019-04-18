package SecondTry.Lessons_Java.pt1_Beginner.Lessons16_Modificators.One;

public class TestClass {
    private int priv_i=5;
    protected int prot_i=6;
    int def_i=7;
    public int pub_i=12;
}
class TestModifiers{
    void methode(){
        new TestClass().def_i=2;
    }
}