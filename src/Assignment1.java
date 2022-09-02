/*   
// AUTHOR: Taylor Knobloch
// FILENAME: Assignment1 
// SPECIFICATION: Asks the user for their name and for their 3 throws in meters. The program will
 * then convert them into yards, feet, inches, and Cm. It will list the conversions.
 */
// FOR: CS 1400 - ASSIGNMENT #1 
// TIME SPENT: 2hours and 45minutes + small adjustments
//*/ 
import java.util.Scanner; 

public class Assignment1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		{
			String user;
			System.out.print("Enter the competitor's name: "); //Asks for the users name
			user = keyboard.nextLine();
			
			System.out.println("\n");
			System.out.printf("%40s", "Olympic Javelin Throws\n");
			System.out.printf("%50s", "Enter the distances, in meters, for " + user);
			System.out.println("\n");
			
			double throw1; 
			double throw2;
			double throw3;
			System.out.print("Please enter the " +
							"the distance for throw 1: "); //Asks for throw 1 
			throw1 = keyboard.nextDouble();
			System.out.println("");
			System.out.print("Please enter the " +
							"the distance for throw 2: "); //Asks for throw 2
			throw2 = keyboard.nextDouble();
			System.out.println("");
			System.out.print("Please enter the " +
							"the distance for throw 3: "); //Asks for throw 3
			throw3 = keyboard.nextDouble();
			System.out.println("\n");
			keyboard.close();
			
			double yards = 1.093;
			double feet = 3;
			double inches = 12;
			double centimeters = 100;
			
			double product1 = throw1 * yards;           //Conversion of throw 1
			double product2 = product1 * feet;
			double product3 = product2 * inches;
			double product4 = throw1 * centimeters;
			
			double product5 = throw2 * yards;           //Conversion of throw 2
			double product6 = product5 * feet;
			double product7 = product6 * inches;
			double product8 = throw2 * centimeters;
			
			double product9 = throw3 * yards;           //Conversion of throw 3
			double product10 = product9 * feet;
			double product11 = product10 * inches;
			double product12 = throw3 * centimeters;
			
			System.out.printf("%-16.10s%-16.10s%-16.10s%-16.10s", "Yards","Feet","Inches","Cm");
			System.out.printf("%n%-16.2f%-16.2f%-16.2f%-16.2f", +
								product1, product2, product3, product4);
			System.out.printf("%n%-16.2f%-16.2f%-16.2f%-16.2f", +
								product5, product6, product7, product8);
			

		}
	}
}