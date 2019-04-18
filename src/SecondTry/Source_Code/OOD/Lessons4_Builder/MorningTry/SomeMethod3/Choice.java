package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod3;

/**
 * Created by user on 02.11.2018.
 */
public abstract class Choice {
    private Query query;
    public void createQuery(){
       query=new Query();
    }
    public Query getQuery(){
        return query;
    }
    public abstract void makeSomething(String something);
    public abstract void paintSomething(String color);

}
