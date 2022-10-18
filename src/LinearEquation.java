import java.text.DecimalFormat;
public class LinearEquation {
    DecimalFormat dRound= new DecimalFormat("0.00");
    private int x1;
    private String pairOne;
    private String pairTwo;
    private String Equation;
    private int x2;
    private double xValue;
    private double newPoint;
    private int y1;
    private int y2;
    private double yIntercept;
    private double slopeY;
    private double slopeX;
    private double slope;
    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        pairOne = "(" + x1 + "," + y1 + ")";
        pairTwo = "(" + x2 + "," + y2 + ")";
        slopeY=(y2-y1);
        slopeX =((x2-x1));
        slope= slopeY/slopeX;
        yIntercept = (this.x1 * -(slope) + this.y1);
        if (yIntercept>=0.00){
            Equation = "Slope intercept form: y= "+slopeY+"/"+slopeX+"x"+"+"+yIntercept;

        }else {
            Equation = "Slope intercept form: y= "+slopeY+"/"+slopeX+"x"+yIntercept;

        }

    }
    public String distance() {
        double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return dRound.format(distance);

    }
    public String toString() {
       String pairs = "First Pair:" + pairOne+ "\n";
       pairs += "Second Pair" + pairTwo + "\n";
       pairs += "Slope of line:"+dRound.format(slope)+"\n";
       pairs += "Y-intercept:"+ dRound.format(yIntercept)+"\n";
       pairs += Equation+"\n";
       pairs += "Distance between points:"+distance();

        return pairs;
    }
    public String coordinatePoint(double xValue){
        this.xValue= xValue;
        double newPoint=(int)(slope)*(xValue-x1)+y1;
        this.newPoint= newPoint;
        String outPut = "Solved coordinate point is: ("+xValue+","+newPoint+")";
        return outPut;
    }
}
