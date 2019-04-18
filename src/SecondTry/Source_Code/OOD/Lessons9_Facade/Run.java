package SecondTry.Source_Code.OOD.Lessons9_Facade;

import java.util.Scanner;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Graph graph=new Graph();
        graph.buildGraph();
        new Graph().buildGraph();


    }
}
