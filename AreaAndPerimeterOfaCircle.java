package textexercisesweek1;

/**
 *
 * @author Ryan
 */
public class AreaAndPerimeterOfaCircle {

    public static void main(String[] args) {
        // displays area and perimeter of a circle that has a radius of 5.5

        //assign radius
        double radius = 5.5;
        //compute perimeter
        double perimeter = 2 * radius * Math.PI;
        //compute area
        double area = radius * radius * Math.PI;
        //display results
        System.out.print("The area for the circle of radius "
                + radius + " is " + area + " and the perimeter is "
                + perimeter);
        }

}
