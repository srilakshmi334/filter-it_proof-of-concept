// CAS Project - filter it.
/*
 * Date: 30/06/2023
 * Authors: Vivian & Sri
 * - Welcome page
 */

// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;


/**
 * The following class runs the main method of the application
 * @author Sri
 *
 */
public class filteritApp extends JFrame {

	// Create a JFrame
	public static JFrame frame = new JFrame("filter it");

	// JLabel for names
	static JLabel names = new JLabel("By: Vivian & Sri");

	public filteritApp() {

		// Set the current design of the JFrame
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(new Color(14, 22, 46));
		displayWelcome();
	}

	/**
	 * The following is a main method which runs the program and displays all the components
	 * of the different classes on the frame
	 * @param args
	 */
	public static void main(String[] args) {

		// Call the welcome page method
		displayWelcome();

		// Display the components on the JFrame
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	} // End of main() method

	/**
	 * The following method displays the welcome page of the application
	 * Includes header, sub-headers, and button to head to main menu
	 */
	public static void displayWelcome() {

		// Set current design of JFrame
		frame.setSize(500, 300);
		frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create JLabels for the header (app title)
		JLabel title1 = new JLabel("filter");
		title1.setBounds(95, 55, 195, 100);
		title1.setFont(new Font("Ink Free", Font.BOLD, 75));
		title1.setForeground(new Color(157, 170, 209));

		JLabel title2 = new JLabel("it.");
		title2.setBounds(300, 55, 90, 100);
		title2.setFont(new Font("Ink Free", Font.BOLD, 75));
		title2.setForeground(Color.WHITE);

		// Create a sub-header for the title
		JLabel titleSub = new JLabel("your one-stop resume builder");
		titleSub.setBounds(55, 130, 370, 40);
		titleSub.setFont(new Font("Ink Free", Font.PLAIN, 30));
		titleSub.setForeground(new Color(250, 249, 246));

		// Set the design for the names JLabel
		names.setBounds(10, 225, 300, 30);
		names.setFont(new Font("Ink Free", Font.BOLD, 17));
		names.setForeground(Color.WHITE);

		// Add the JLabels to the frame
		frame.add(title1);
		frame.add(title2);
		frame.add(titleSub);
		frame.add(names);

		// Create a "main menu" JButton
		JButton mainMenu = new JButton("main menu");
		mainMenu.setBounds(335, 210, 135, 40);
		mainMenu.setBackground(new Color(135, 145, 161));
		mainMenu.setFont(new Font("Ink Free", Font.BOLD, 20));

		// Add an ActionListener that leads the user to the main menu page
		// when the button is clicked
		mainMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear all the components in the current JFrame
				frame.getContentPane().removeAll();
				frame.repaint();

				// Link to the main menu page
				filteritMenu menu = new filteritMenu();

			}

		});

		// Add the "main menu" JButton to the frame
		frame.add(mainMenu);
	}

}
