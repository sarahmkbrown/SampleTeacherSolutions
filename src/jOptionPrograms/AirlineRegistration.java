//Copyright The League of Amazing Programmers 
//Level 0
package jOptionPrograms;

import javax.swing.JOptionPane;

/**
* Airline registration
* 
* You are writing a program for a new airline to take their registration
* information at the check-in counter and print their boarding pass. You need
* to collect the following information: First name Last name Destination
* airport Birthday (for security purposes) Male/female (for security purposes)
* 
* Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
* M/F) Traveling to: DESTINATION
* 
* Toolbox: main() method, JOptionPane.showInputDialog, variables
* 
**/
public class AirlineRegistration
{
	public static void main(String[] args)
	{
		String firstName = JOptionPane.showInputDialog(null, "Enter first name:");
		String lastName = JOptionPane.showInputDialog(null, "Enter last name:");
		String birthday = JOptionPane.showInputDialog(null, "Enter birthday (mm/dd/yy)");
		String gender = JOptionPane.showInputDialog(null, "M/F?");
		String destination = JOptionPane.showInputDialog(null, "Where is your destination?");
		JOptionPane.showMessageDialog(null, lastName.toUpperCase() + " / " + firstName.toUpperCase() + " (" + birthday
				+ ", " + gender.toUpperCase() + ")" + "\nTravelling to: " + destination.toUpperCase());

	}
}
