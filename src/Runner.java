import javax.sound.sampled.Line;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String xyPoint;
        String xyPointTwo;
        System.out.print("Enter the first x-y coordinate point: ");
        xyPoint= s.nextLine();
        String[] parts = xyPoint.split(",");
        String x= parts[0].trim().substring(1).trim();
        String y = parts[1].trim().substring(0,parts[1].trim().length()-1).trim();
        System.out.println();
        System.out.print("Enter the second x-y coordinate point: ");
        xyPointTwo = s.nextLine();
        String[] partsTwo = xyPointTwo.split(",");
        String x2= partsTwo[0].trim().substring(1).trim();
        String y2 = partsTwo[1].trim().substring(0,parts[1].trim().length()-1).trim();
        LinearEquation Equation1= new LinearEquation(x,x2,y,y2);
        System.out.println(Equation1.toString());
    }
}
