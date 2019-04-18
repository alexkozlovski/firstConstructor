package SecondTry.Source_Code.OOD.Lessons9_Facade;

/**
 * Created by user on 04.11.2018.
 */
public class Graph {
    private Axis xAxis,yAxis;
    private  Description description;
    private Point pointA,pointB;
    private Line line;

    public Graph(){
        this.xAxis=new Axis("X");
        this.yAxis=new Axis("Y");
        this.description=new Description("The graph of function");
        this.pointA=new Point("A");
        this.pointB=new Point("B");
        this.line=new Line(pointA,pointB);
    }
    public void buildGraph() throws InterruptedException {
        System.out.println("Plotting...");
        Thread.sleep(1000);
        xAxis.add();
        yAxis.add();
        description.add();
        pointA.add();
        pointB.add();
        line.add();
        System.out.println("\n");
    }
}
