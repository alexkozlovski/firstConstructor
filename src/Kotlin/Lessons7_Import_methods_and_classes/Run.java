package Kotlin.Lessons7_Import_methods_and_classes;

import Kotlin.Lessons7_Import_methods_and_classes.animals.UtilsKt;
import Kotlin.Lessons7_Import_methods_and_classes.animals.dog.DogA;

/**
 * Created by user on 21.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        DogA dogA=new DogA("piska");
        dogA.a1();
        UtilsKt.method();
    }
}
