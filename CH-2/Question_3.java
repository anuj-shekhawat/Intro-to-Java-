import java.util.Scanner;

public class Question_3
{
    public static void main(final String[] args) 
    {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet:");
        final double feet = input.nextDouble();

        final double meters = (.305 * feet);
        System.out.print(feet + "feet is" + meters + "Meters");


        
    }
}
