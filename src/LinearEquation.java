import java.math.MathContext;
import java.text.DecimalFormat;

import static java.lang.System.out;

public class LinearEquation {
    DecimalFormat dRound= new DecimalFormat("0.00");
    private int x1;
    private String pairOne;
    private String pairTwo;
    private String Equation;
    private int x2;
    private double xValue;
    private String newPoint;
    private int y1;
    private int y2;
    private double yIntercept;
    private double distance;
    private double slope;
    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        pairOne = "(" + x1 + "," + y1 + ")";
        pairTwo = "(" + x2 + "," + y2 + ")";
        slope =((y2-y1)/(x2-x1));
        yIntercept = (double) (this.x1 * -(slope) + this.y1);
        if (yIntercept>=0.00){
            Equation = "Slope intercept form: y= "+slope+"x"+"+"+yIntercept;

        }else {
            Equation = "Slope intercept form: y= "+slope+"x"+yIntercept;

        }

    }
    public String distance() {
        distance = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        return dRound.format(distance);

    }
    public String toString() {
       String pairs = "First Pair:" + pairOne+ "\n";
       pairs += "Second Pair" + pairTwo + "\n";
       pairs += "Slope of line:"+(slope)+"\n";
       pairs += "Y-intercept:"+ dRound.format(yIntercept)+"\n";
       pairs += Equation+"\n";
       pairs += "Distance between points:"+distance()+"\n";
       pairs+= "Solved coordinate point is:"+ newPoint;

        return pairs;
    }
    public String coordinatePoint(String xValue){
        this.xValue= Integer.parseInt(xValue);
        double valueY= (slope*this.xValue)+yIntercept;
        String newPoint = "("+this.xValue+","+valueY+")";
        return newPoint;
    }
}
