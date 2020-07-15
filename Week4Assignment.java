// Code reviewed by @professorgordon
// Hannah McBeth
import java.lang.Math;
import java.util.Scanner;

public class Week4Assignment {

	public static void main(String[] args) {
		
		// Variable Declarations
				double boxLength;
				double boxHeight;
				double boxWidth;
				double boxSurfaceArea = 1;
				double boxVolume = 1;
				
				Scanner input = new Scanner(System.in);
	
				System.out.print("\nHello, we're going to help you calculate the surface area and volume of a box." + "\nJust input the correct measurements when prompted." + "\nEnter the box length in inches: ");
				boxLength = input.nextDouble();
				
				System.out.print("Enter the box height in inches: ");
				boxHeight = input.nextDouble();
		
				System.out.print("Enter the box width in inches: ");
				boxWidth = input.nextDouble();
		
				System.out.println("User Entered Dimensions:");
				System.out.println("\tLength: " + boxLength);
				System.out.println("\tHeight: " + boxHeight);
				System.out.println("\tWidth: " + boxWidth);
				boxVolume = calculateBoxVolume(boxLength, boxWidth, boxHeight);
				boxSurfaceArea = calculateBoxSurfaceArea(boxLength, boxWidth, boxHeight);
				System.out.printf("The surface area of your box is: %.0f", boxSurfaceArea);
				System.out.printf("\n"
						+ "The volume of your box is: %.0f", boxVolume);
				input.close();
	}
	
	public static double calculateBoxVolume(double boxLength, double boxWidth, double boxHeight)
	{
				double boxVolume = (boxLength * boxWidth * boxHeight);
				return boxVolume;
	}
	
	public static double calculateBoxSurfaceArea(double boxLength, double boxWidth, double boxHeight)
	{
				double boxSurfaceArea = (boxHeight * 2 * boxWidth) + (boxHeight * 2 * boxLength) + (boxWidth * 2 * boxLength);
				return boxSurfaceArea;
	}
	
}
