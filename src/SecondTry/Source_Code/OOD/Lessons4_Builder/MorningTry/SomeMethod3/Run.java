package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod3;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Choice choice=new Something();
        Client client=new Client();
        client.setChoice(choice);
        client.makeSomthing("hz hzh hz h","BLUE");

    }
}
