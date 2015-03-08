//Copyright The League of Amazing Programmers 
//Level 0
package jOptionPrograms;
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
	
		String crush = JOptionPane.showInputDialog(null," Who do you not like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+ crush);
		String friend = JOptionPane.showInputDialog(null," Who is your best friend?");
		JOptionPane.showMessageDialog(null,  friend + " is as sweet as candy");
	}
}
