import java.util.Scanner;
public class EquationRunner {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Welcome! Enter the first x-y coordinate point: ");
            String xyPoint = s.nextLine();
            int x1 = Integer.parseInt(xyPoint.substring(xyPoint.indexOf("(") + 1, xyPoint.indexOf(",")));
            int y1 = Integer.parseInt(xyPoint.substring(xyPoint.indexOf(",") + 1, xyPoint.indexOf(")")));
            System.out.print("Enter the second x-y coordinate point: ");
            String xyPointTwo = s.nextLine();
            int x2 = Integer.parseInt(xyPointTwo.substring(xyPointTwo.indexOf("(") + 1, xyPointTwo.indexOf(",")));
            int y2 = Integer.parseInt(xyPointTwo.substring(xyPointTwo.indexOf(",") + 1, xyPointTwo.indexOf(")")));
            LinearEquation Equation = new LinearEquation(x1,x2,y1,y2);
            System.out.println(Equation.toString());
            System.out.print("Enter a new x coordinate:");
            double newXCoordinate = Double.parseDouble(s.nextLine());
            System.out.print(Equation.coordinatePoint(newXCoordinate));
        }

}
