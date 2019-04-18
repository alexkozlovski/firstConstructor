package SecondTry.Source_Code.OOD.Lessons16_Null_Object;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        AbstractOS windows=OSFactory.createObject("windows");
        AbstractOS macOS=OSFactory.createObject("MacOS");
        AbstractOS ubuntu=OSFactory.createObject("Ubuntu");
        AbstractOS fakeOS=OSFactory.createObject("Fake OS v1.0");
        List<AbstractOS> abstractOSList=new ArrayList<>();
        abstractOSList.add(windows);
        abstractOSList.add(macOS);
        abstractOSList.add(ubuntu);
        abstractOSList.add(fakeOS);
        for (AbstractOS abstractOS:abstractOSList){
            System.out.printf("Title: %s, IsNull?: %s.%n",abstractOS.getTitle(),abstractOS.isNull());
        }
        abstractOSList.forEach(abstractOS -> System.out.printf("Title: %s, IsNull?: %s.%n",abstractOS.getTitle(),abstractOS.isNull()));
    }
}
