package SecondTry.Source_Code.OOD.Lessons13_Iterator.try1;

import SecondTry.Source_Code.OOD.Lessons13_Iterator.try1.DataBase;

import java.util.Arrays;


public class Run {

    public static void main(String[] args) {
        DataBase database=new DataBase();
        database.add("as");
        for (int i = 0; i < 1; i++) {
            String s="a";
            String[] sar=new String[10];
            for (int j = 0; j <10 ; j++) {
                sar[j]=s+j;
            }
            database.addAll(sar);
        }
        Iterator iterator=database.getIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

    }
}
