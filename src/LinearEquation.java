import java.math.MathContext;
public class LinearEquation {
  private int  x1;
  private int x2;
  private int y1;
  private int y2;
  private double yIntercept;
  private double distance;
  private double slope;
  private double slopey;
  public LinearEquation(int x1,int x2, int y1, int y2){
      this.x1=x1; this.x2=x2; this.y1 = y1; this.y2=y2;
      slope=(y2-y1);  slopey=(x2-x1);
      System.out.println(slope/slopey);
      int yIntercept=  (int)(x1*-(slope/slopey)+y1);
      System.out.println(yIntercept);


  }
  public double distance(){
      distance= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
      return distance;
  }

}
