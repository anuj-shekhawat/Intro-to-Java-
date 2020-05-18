import java.util.Scanner;

public class Question_19 {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        // Prompt the user to enter three points
        System.out.print("Enter three points for a triangle: ");
        final double x1 = input.nextDouble();
        final double y1 = input.nextDouble();
        final double x2 = input.nextDouble();
        final double y2 = input.nextDouble();
        final double x3 = input.nextDouble();
        final double y3 = input.nextDouble();

        // Compute the area of a triangle
        final double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        final double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        final double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        final double s = (side1 + side2 + side3) / 2;
        final double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		// Display result
		System.out.println("The area of the triangle is " + area);
    }
}