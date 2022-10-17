import java.math.MathContext;

import static java.lang.System.out;

public class LinearEquation {
    private int x1;
    private String pairOne;
    private String pairTwo;
    private String Equation;
    private int x2;
    private int y1;
    private int y2;
    private int yIntercept;
    private double distance;
    private double slope;
    private double slopey;
    public LinearEquation(String x1, String x2, String y1, String y2) {
        this.x1 = Integer.parseInt(x1);
        this.x2 = Integer.parseInt(x2);
        this.y1 = Integer.parseInt(y1);
        this.y2 = Integer.parseInt(y2);
        pairOne = "(" + x1 + "," + y1 + ")";
        pairTwo = "(" + x2 + "," + y2 + ")";
        slope = (this.y2-this.y1);
        slopey = (this.x2 - this.x1);
        //System.out.println(slope /slopey);//
        yIntercept = (int) (Integer.parseInt(x1) * -(slope / slopey) + Integer.parseInt(y1));
        Equation = "Slope intercept form: y= "+(slope/slopey)+"x"+"+"+yIntercept;

    }

    public String distance() {
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return "Distance between points:"+distance;

    }

    public String toString() {
       String pairs = "First Pair:" + pairOne+ "\n";
       pairs += "Second Pair" + pairTwo + "\n";
       pairs += "Slope of line:"+(slope / slopey)+"\n";
       pairs += "Y-intercept:"+ yIntercept+"\n";
       pairs += Equation+"\n";
       pairs += distance;

        return pairs;


    }
}
