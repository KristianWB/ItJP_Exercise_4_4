import java.util.Scanner;

public class AreaOfAHexagon {
    public static void main(String[] args)   {

        /*
        in this exercise we are tasked to prompt a user for the length of the sides of a pentagon and from there
        to calculate the area of the hexagon.
        I will built the program in three steps. First i will prompt the user for the length of the sides, second i will
        calculate the area from the side length and third i will print the result to screen
         */

            /* First step... Here i declare the scanner input, then i prompt for side length of hexagon and i declare
            and assign the length to a variable.
            */

        Scanner input = new Scanner(System.in);

                // Prompting user for side length
        System.out.print("Please enter the length of the side in the hexagon: ");
        double side = input.nextDouble();   // Declaring and assigning the value into the variable "side"

            /*
            Second step is to calculate the area of the hexagon from the given formula
            */

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));

            /*
            Third step is to print out the result
             */

        System.out.printf(
                "\nThe area of the hexagon is: %10.2f", area);
    }
}
