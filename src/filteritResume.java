// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class is responsible for the building of the resumes
 * @author Sri
 *
 */
public class filteritResume {
	
	// Class variables
	
	// For displayProjects() method
	public static JLabel projectStatus = new JLabel(); // updates the status of the project folder
	public static JLabel hello = new JLabel(); // to say hello to the user upon entry
	public static JButton addProject = new JButton(); // button to create new projects
	
	// For displayTemplates() method
	public static JButton formalTemplate = new JButton();
	public static JButton artTemplate = new JButton();
	public static JButton contempTemplate = new JButton();
	
	public filteritResume() {
		
		// Set the current design of the JFrame
		filteritApp.frame.setSize(500, 610);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));
		
	} // End of filteritResume() constructor
	
	/**
	 * The following method displays the current resume projects you are working on
	 */
	public static void displayProjects() {
		
		// Set the current design of the JFrame
		filteritApp.frame.setSize(500, 610);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));
		
		// Create a "your projects" header JLabel
		JLabel yourProjects = new JLabel("your projects");
		yourProjects.setBounds(120, 30, 280, 50);
		yourProjects.setFont(new Font("Ink Free", Font.BOLD, 40));
		yourProjects.setForeground(new Color(157, 170, 209));
		
		// Create a "current projects" sub-header JLabel
		JLabel currentProjects = new JLabel("current projects");
		currentProjects.setBounds(20, 100, 180, 30);
		currentProjects.setFont(new Font("Ink Free", Font.PLAIN, 25));
		currentProjects.setForeground(Color.WHITE);
		
		// Set the design of the project status JLabel
		projectStatus.setText("seems like you don't have any projects yet...");
		projectStatus.setBounds(60, 150, 380, 25);
		projectStatus.setFont(new Font("Ink Free", Font.PLAIN, 20));
		projectStatus.setForeground(new Color(250, 249, 246));
		
		// Set the design for the hello user JLabel
		//hello.setText("hello " + filteritMenu.nameEntered);
		hello.setBounds(350, 12, 180, 20); // if you want to right align, need to comment this
		hello.setFont(new Font("Ink Free", Font.PLAIN, 17));
		hello.setForeground(Color.WHITE);
		
		// *****code that should work, but isn't*****
		hello.setPreferredSize(new Dimension(180, 20));
		hello.setHorizontalAlignment(JLabel.RIGHT);
		hello.setVerticalAlignment(JLabel.TOP);
		
		// Add the JLabels to the frame
		filteritApp.frame.add(yourProjects);
		filteritApp.frame.add(currentProjects);
		filteritApp.frame.add(projectStatus);
		filteritApp.frame.add(hello);
		
		filteritApp.frame.setVisible(true);
		
		// Create a new project JButton
		addProject.setIcon(new ImageIcon("project.jpg"));
		addProject.setBounds(60, 200, 100, 130);
		addProject.setBackground(new Color(14, 22, 46));
		addProject.setBorder(BorderFactory.createEmptyBorder());
		
		// Add an ActionListener that leads the user to the templates page of the app
		addProject.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
				
				// Link to the templates page
				displayTemplates();
				
			}
			
		});
		
		// Add the new project JButton to the frame
		filteritApp.frame.add(addProject);
		
		// Add a "back" JButton that leads the user back to the login page
		JButton loginBack = new JButton("back");
		loginBack.setBounds(390, 520, 80, 35);
		loginBack.setBackground(new Color(135, 145, 161));
		loginBack.setFont(new Font("Ink Free", Font.BOLD, 20));
		
		// Add an ActionListener that leads the user back to the login page when the
		// button is clicked
		loginBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
				
				// Link to the login page
				filteritMenu.displayLogin();
				
			}
			
		});
		
		// Add the "back" JButton to the frame
		filteritApp.frame.add(loginBack);
	}
	
	/**
	 * The following method displays the available resume templates
	 */
	public static void displayTemplates() {
		
		// Set the current design of the JFrame
		filteritApp.frame.setSize(500, 670);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));
		
		// Create an "our designs" header JLabel
		JLabel ourDesigns = new JLabel("our designs");
		ourDesigns.setBounds(140, 30, 280, 50);
		ourDesigns.setFont(new Font("Ink Free", Font.BOLD, 40));
		ourDesigns.setForeground(new Color(157, 170, 209));
		
		// Add the JLabels to the frame
		filteritApp.frame.add(ourDesigns);
		
		// Create a formal template JButton
		formalTemplate.setIcon(new ImageIcon("formal.jpg"));
		formalTemplate.setBounds(30, 90, 170, 230);
		formalTemplate.setBackground(new Color(14, 22, 46));
		formalTemplate.setBorder(BorderFactory.createEmptyBorder());
		
		// Create an ActionListener that leads the user to edit the formal template
		formalTemplate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
				
				// Link to editing the formal template
				
				
			}
			
			
		});
		
		// Create an artistic template JButton
		artTemplate.setIcon(new ImageIcon("art.jpg"));
		artTemplate.setBounds(280, 90, 170, 230);
		artTemplate.setBackground(new Color(14, 22, 46));
		artTemplate.setBorder(BorderFactory.createEmptyBorder());
		
		// Add an ActionListener that leads the user to edit the artistic template
		artTemplate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
				
				// Link to editing the artistic template
				
				
			}
			
		});
		
		// Create a contemporary template JButton
		contempTemplate.setIcon(new ImageIcon("contemporary.jpg"));
		contempTemplate.setBounds(150, 360, 170, 230);
		contempTemplate.setBackground(new Color(14, 22, 46));
		contempTemplate.setBorder(BorderFactory.createEmptyBorder());
		
		// Add an ActionListener that leads the user to edit the contemporary template
		contempTemplate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
				
				// Link to editing the contemporary template
				
				
			}
			
		});
		
		// Add the template JButtons to the frame
		filteritApp.frame.add(formalTemplate);
		filteritApp.frame.add(artTemplate);
		filteritApp.frame.add(contempTemplate);
		
		// Create the JLabels for the different templates
		JLabel formalDescrip = new JLabel("you're the next CEO");
		formalDescrip.setBounds(30, 325, 280, 25);
		formalDescrip.setFont(new Font("Ink Free", Font.PLAIN, 20));
		formalDescrip.setForeground(Color.WHITE);
		
		JLabel artDescrip = new JLabel("this generation's picasso");
		artDescrip.setBounds(257, 325, 280, 25);
		artDescrip.setFont(new Font("Ink Free", Font.PLAIN, 20));
		artDescrip.setForeground(Color.WHITE);
		
		JLabel contempDescrip = new JLabel("next google marketer?");
		contempDescrip.setBounds(140, 595, 350, 25);
		contempDescrip.setFont(new Font("Ink Free", Font.PLAIN, 20));
		contempDescrip.setForeground(Color.WHITE);
		
		// Add the template description JLabels to the frame
		filteritApp.frame.add(formalDescrip);
		filteritApp.frame.add(artDescrip);
		filteritApp.frame.add(contempDescrip);
		
		// Add a "back" JButton that leads the user back to the your projects page
		JButton projectsBack = new JButton("back");
		projectsBack.setBounds(390, 580, 80, 35);
		projectsBack.setBackground(new Color(135, 145, 161));
		projectsBack.setFont(new Font("Ink Free", Font.BOLD, 20));
				
		// Add an ActionListener that leads the user back to the your projects page when the
		// button is clicked
		projectsBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
						
				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();
						
				// Link to the your projects page
				displayProjects();
						
			}
					
		});
				
		// Add the "back" JButton to the frame
		filteritApp.frame.add(projectsBack);
	}

}