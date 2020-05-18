import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args)
    {
        final double PI= 3.14159265359;
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder:");
        final double radius = input.nextDouble();
        final double length = input.nextDouble();
        
        final double area= radius * radius * PI;
        final double volume = area * length;
        System.out.println("The area is" + area);
        System.out.println("The volume is" + volume);
        
    }
}