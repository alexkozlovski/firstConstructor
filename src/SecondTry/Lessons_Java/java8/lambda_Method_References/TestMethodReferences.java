package SecondTry.Lessons_Java.java8.lambda_Method_References;

import SecondTry.Lessons_Java.java8.lambda_Method_References.product.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class TestMethodReferences {
    public static void main(String[] args) throws InterruptedException {
        Creator creator=TeslaCreator.getInstance();
        Product teslaroadster=creator.manage("teslaroadster");
        teslaroadster.make();
        creator=SpaceXCreator.getInstance();
        Product falcon9=creator.manage("falcon9");
        falcon9.make();
        Stream.of(teslaroadster,falcon9).map(Product::toString).forEach(System.out::println);


    }

}
