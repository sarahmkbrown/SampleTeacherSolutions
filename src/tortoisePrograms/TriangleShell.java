//Copyright League of Amazing Programmers
//Level 0
package tortoisePrograms;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell{

	public static void main(String[] args) {

		// 5. Make the tortoise go as fast as possible
		Tortoise.setSpeed(10);
		// 3. make a variable to hold the length of the triangle and set it to
		// 25
		int length = 25;
		// 6. Do the following (up to step 9) 60 times
		for (int i = 0; i < 60; i++) {
			// 8. Change the color of the line the tortoise draws to a random
			// color
			Tortoise.setPenColor(Colors.getRandomColor());
			// 7. Increase the length of the side by 4 pixels
			length = length + 4;
			// 4. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 9. Turn the tortoise 6 degrees to the right
			Tortoise.turn(6);
		}
	}

	/*
	 * 1. fill in the method below to draw a triangle. Use the length variable
	 * for the size of the triangle.
	 */
	private static void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(length);
			Tortoise.turn(120);

		}
	}

}

