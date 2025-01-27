// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class displays the main menu of the program
 * @author Sri
 *
 */
public class filteritMenu {

	// Class variables
	static JLabel infoError = new JLabel(); // for incorrect sign-up data
	static JLabel confirmedSignUp; // for confirmed sign-up
	static JLabel validLogin = new JLabel(); // for status of user login
	//static String nameEntered;
	static String fileName = "filteritAccount.txt";
	static HashMap<String, String> loginInfo = new HashMap <String, String>();
	static String line;



	/**
	 * The following constructor method displays the main menu of the app
	 */
	public filteritMenu() {


		// Set the current design of the JFrame
		filteritApp.frame.setSize(500, 300);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create JLabels

		// Create menu header JLabel
		JLabel hMenu = new JLabel("we know you need a job...");
		hMenu.setBounds(50, 25, 380, 45);
		hMenu.setFont(new Font("Ink Free", Font.BOLD, 35));
		hMenu.setForeground(new Color(157, 170, 209));

		// Create an info sub-header JLabel
		JLabel hSub = new JLabel("and we have your solution.");
		hSub.setBounds(95, 70, 360, 45);
		hSub.setFont(new Font("Ink Free", Font.PLAIN, 25));
		hSub.setForeground(Color.WHITE);

		// Add JLabels to the frame
		filteritApp.frame.add(hMenu);
		filteritApp.frame.add(hSub);

		// Create JButtons

		// Create an "about" JButton
		JButton bAboutPage = new JButton("about");
		bAboutPage.setBounds(50, 130, 100, 45);
		bAboutPage.setBackground(new Color(165, 173, 196));
		bAboutPage.setFont(new Font("Ink Free", Font.BOLD, 20));
		bAboutPage.setForeground(Color.WHITE);

		// Add an ActionListener for the "about" JButton that leads the user to the about
		// page when the button is clicked
		bAboutPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the about page
				displayAbout();

			}

		});

		// Create a "login" page
		JButton bLoginPage = new JButton("login");
		bLoginPage.setBounds(190, 130, 100, 45);
		bLoginPage.setBackground(new Color(105, 124, 184));
		bLoginPage.setFont(new Font("Ink Free", Font.BOLD, 20));
		bLoginPage.setForeground(Color.BLACK);

		// Add an ActionListener for the "login" JButton that leads the user to the login
		// page when the button is clicked
		bLoginPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the login page
				displayLogin();

			}

		});

		// Create a "logout" page
		JButton bLogoutPage = new JButton("logout");
		bLogoutPage.setBounds(330, 130, 100, 45);
		bLogoutPage.setBackground(new Color(81, 106, 184));
		bLogoutPage.setFont(new Font("Ink Free", Font.BOLD, 20));
		bLogoutPage.setForeground(Color.WHITE);

		// Add an ActionListener for the "logout" JButton that leads the user to the logout
		// page when the button is clicked
		bLogoutPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the logout page
				displayLogout();	

			}

		});

		// Add the JButtons to the frame
		filteritApp.frame.add(bAboutPage);
		filteritApp.frame.add(bLoginPage);
		filteritApp.frame.add(bLogoutPage);

		// Create a "back" JButton that leads the user to the original welcome page
		JButton bBackWelcome = new JButton("back");
		bBackWelcome.setBounds(390, 215, 80, 35);
		bBackWelcome.setBackground(new Color(135, 145, 161));
		bBackWelcome.setFont(new Font("Ink Free", Font.BOLD, 20));

		// Add an ActionListener for the "back" JButton that leads the user to the welcome
		// page when the button is clicked
		bBackWelcome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the welcome page
				filteritApp.displayWelcome();

			}

		});

		// Add "back" JButton to the frame
		filteritApp.frame.add(bBackWelcome);

	} // End of filteritMenu() constructor

	/**
	 * The following method displays the about page of the app
	 */
	public static void displayAbout() {

		// Set the design of the JFrame
		filteritApp.frame.setSize(500, 610);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create an intro header for the page
		JLabel hIntro = new JLabel("the you that you never knew existed...");
		hIntro.setBounds(20, 30, 480, 40);
		hIntro.setFont(new Font("Ink Free", Font.BOLD, 26));
		hIntro.setForeground(new Color(157, 170, 209));

		// Add intro header to the frame
		filteritApp.frame.add(hIntro);

		// Declare variables
		String file = "aboutfilterit.txt";
		String readLine;

		// Create a JTextArea that is storing the info in "aboutfilterit.txt"
		JTextArea aAbout = new JTextArea();
		aAbout.setBounds(20, 80, 445, 400);
		aAbout.setFont(new Font("Ink Free", Font.PLAIN, 16));
		aAbout.setForeground(Color.WHITE);
		aAbout.setOpaque(false); // make the area transparent

		// Add the JTextArea to the frame and set it to be non-editable
		filteritApp.frame.add(aAbout);
		aAbout.setEditable(false);

		// Read the info from the "aboutfilterit.txt" file and add the info to the JTextArea
		try {
			BufferedReader readIn = new BufferedReader(new FileReader(file));

			// Read in each line while "aboutfilterit.txt" is not empty and add
			// each line to the JTextArea
			while((readLine = readIn.readLine()) != null) {
				aAbout.read(readIn, "aAbout");
			}
		}

		// Else, print an error message to the console in regards to the reading of the file
		catch(IOException iox) {
			System.out.println("Problem reading " + file);
		}

		// Create a copyright JLabel
		JLabel filteritCopyright = new JLabel("Copyright filter it 2023. All Rights Reserved. CASproject2023.");
		filteritCopyright.setBounds(45, 540, 470, 20);
		filteritCopyright.setFont(new Font("Ink Free", Font.PLAIN, 14));
		filteritCopyright.setForeground(Color.WHITE);

		// Add the copyright JLabel to the frame
		filteritApp.frame.add(filteritCopyright);

		// Add a "back" JButton that leads the user back to the menu page
		JButton bBackMenu = new JButton("back");
		bBackMenu.setBounds(390, 495, 80, 35);
		bBackMenu.setBackground(new Color(135, 145, 161));
		bBackMenu.setFont(new Font("Ink Free", Font.BOLD, 20));

		// Add an ActionListener that leads the user back to the menu page when the
		// button is clicked
		bBackMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the menu page
				filteritMenu menu = new filteritMenu();

			}

		});

		// Add the "back" JButton to the frame
		filteritApp.frame.add(bBackMenu);

	}

	/**
	 * The following method displays the login page of the app
	 */
	public static void displayLogin() {

		// Set the design of the JFrame
		filteritApp.frame.setSize(500, 610);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create a "login" header JLabel
		JLabel login = new JLabel("login");
		login.setBounds(200, 30, 120, 50);
		login.setFont(new Font("Ink Free", Font.BOLD, 40));
		login.setForeground(new Color(157, 170, 209));

		// Add "login" header to the JFrame
		filteritApp.frame.add(login);

		// Create JLabels for user's name, username, and password
		//JLabel name = new JLabel("name: ");
		//name.setBounds(90, 120, 70, 35);
		//name.setFont(new Font("Ink Free", Font.PLAIN, 25));
		//name.setForeground(Color.WHITE);

		JLabel username = new JLabel("username: ");
		username.setBounds(90, 190, 120, 35);
		username.setFont(new Font("Ink Free", Font.PLAIN, 25));
		username.setForeground(Color.WHITE);

		JLabel password = new JLabel("password: ");
		password.setBounds(90, 260, 120, 35);
		password.setFont(new Font("Ink Free", Font.PLAIN, 25));
		password.setForeground(Color.WHITE);

		// Add JLabels to the frame
		//filteritApp.frame.add(name);
		filteritApp.frame.add(username);
		filteritApp.frame.add(password);

		// Create JTextFields to input the user's information
		//JTextField nameInfo = new JTextField();
		//nameInfo.setBounds(217, 127, 200, 20);

		JTextField usernameInfo = new JTextField();
		usernameInfo.setBounds(217, 197, 200, 20);

		JTextField pwdInfo = new JTextField();
		pwdInfo.setBounds(217, 267, 200, 20);

		// Add the JTextFields to the frame
		//filteritApp.frame.add(nameInfo);
		filteritApp.frame.add(usernameInfo);
		filteritApp.frame.add(pwdInfo);

		// Create an "enter" JButton
		JButton enter = new JButton("enter");
		enter.setBounds(190, 340, 110, 40);
		enter.setBackground(new Color(211, 222, 213));
		enter.setFont(new Font("Ink Free", Font.BOLD, 25));

		// Add the "enter" JButton to the frame
		filteritApp.frame.add(enter);

		// Stores account information
		loginInfo = new HashMap<>();
		
		//store all the info from the text file into the hashmap
				try {
					BufferedReader reader = new BufferedReader(new FileReader(fileName));
					String usernameInput = "";
					String pwdInput = "";
					String splitInfo[];
					while ((line = reader.readLine()) != null) {
						//seperate the username and password from textfile
						//put information into hashmap
						splitInfo = line.split(" ");
						usernameInput = splitInfo[0];
						pwdInput = splitInfo[1];
						loginInfo.put(usernameInput, pwdInput);

					}

				} catch (Exception IOX) {
					JOptionPane.showMessageDialog(filteritApp.frame, "Error, please restart program.");
				}

		// Add an ActionListener that leads the user to the resume page of the app
		enter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// Set the design of the login status JLabel
				validLogin.setBounds(130, 495, 250, 40);
				validLogin.setFont(new Font("Ink Free", Font.PLAIN, 20));
				validLogin.setForeground(Color.WHITE);

				if (e.getSource() == enter) {
					String u = usernameInfo.getText();
					String p = pwdInfo.getText();

					// Check if the username exists
					if(loginInfo.containsKey(u)) {
						if((loginInfo.get(u).equals(p))) { // Check if password is equal to the id

							// Clear the frame and paint the background
							filteritApp.frame.getContentPane().removeAll();
							filteritApp.frame.setBackground(new Color(14, 22, 46));

							// Link to the resume page
							filteritResume.displayProjects();
						}
						else {
							validLogin.setText("Password is incorrect, try again!");
							filteritApp.frame.add(validLogin);
							usernameInfo.setText("");
							pwdInfo.setText("");
							filteritApp.frame.repaint();
						}
					}
					else {
						validLogin.setText("Account does not exist, try again!");
						filteritApp.frame.add(validLogin);
						usernameInfo.setText("");
						pwdInfo.setText("");
						filteritApp.frame.repaint();
					}
				}					

			}}

				);

		// Create a no account yet header JLabel
		JLabel noAccnt = new JLabel("wait, you don't have an account?");
		noAccnt.setBounds(105, 395, 290, 40);
		noAccnt.setFont(new Font("Ink Free", Font.PLAIN, 20));
		noAccnt.setForeground(Color.WHITE);

		// Add the no account JLabel to the frame
		filteritApp.frame.add(noAccnt);

		// Create a "sign-up" JButton
		JButton register = new JButton("sign-up");
		register.setBounds(185, 445, 120, 40);
		register.setBackground(new Color(210, 209, 235));
		register.setFont(new Font("Ink Free", Font.BOLD, 25));

		// Create an ActionListener that leads the user to the sign-up page when
		// the button is clicked
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the sign-up page
				displaySignUp();

			}

		});

		// Add the "sign-up" JButton to the frame
		filteritApp.frame.add(register);

		// Add a "back" JButton that leads the user back to the menu page
		JButton bBackMenu = new JButton("back");
		bBackMenu.setBounds(390, 520, 80, 35);
		bBackMenu.setBackground(new Color(135, 145, 161));
		bBackMenu.setFont(new Font("Ink Free", Font.BOLD, 20));

		// Add an ActionListener that leads the user back to the menu page when the
		// button is clicked
		bBackMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the menu page
				filteritMenu menu = new filteritMenu();

			}

		});

		// Add the "back" JButton to the frame
		filteritApp.frame.add(bBackMenu);

	}

	/**
	 * The following method displays the sign-up page of the app
	 */
	public static void displaySignUp() {


		// Set the design of the JFrame
		filteritApp.frame.setSize(500, 610);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create a "sign-up" header JLabel
		JLabel signup = new JLabel("sign-up");
		signup.setBounds(170, 30, 140, 50);
		signup.setFont(new Font("Ink Free", Font.BOLD, 40));
		signup.setForeground(new Color(157, 170, 209));

		// Add the "sign-up" JLabel to the frame
		filteritApp.frame.add(signup);

		// Create JLabels for user's name, username, and password
		/*	JLabel nameLabel = new JLabel("name: ");
		nameLabel.setBounds(90, 120, 70, 35);
		nameLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		nameLabel.setForeground(Color.WHITE);
		 */
		JLabel userLabel = new JLabel("username: ");
		userLabel.setBounds(90, 190, 120, 35);
		userLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		userLabel.setForeground(Color.WHITE);

		JLabel pwdLabel = new JLabel("password: ");
		pwdLabel.setBounds(90, 260, 120, 35);
		pwdLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		pwdLabel.setForeground(Color.WHITE);

		// Create a minimum characters JLabel for the password
		JLabel charMin = new JLabel("8 characters minimum");
		charMin.setBounds(90, 290, 280, 20);
		charMin.setFont(new Font("Ink Free", Font.PLAIN, 15));
		charMin.setForeground(Color.WHITE);

		// Add JLabels to the frame
		//filteritApp.frame.add(nameLabel);
		filteritApp.frame.add(userLabel);
		filteritApp.frame.add(pwdLabel);
		filteritApp.frame.add(charMin);

		// Create JTextFields to input the user's information
		//JTextField nameInput = new JTextField();
		//nameInput.setBounds(217, 127, 200, 20);

		JTextField usernameInput = new JTextField();
		usernameInput.setBounds(217, 197, 200, 20);

		JTextField pwdInput = new JTextField();
		pwdInput.setBounds(217, 267, 200, 20);

		// Add the JTextFields to the frame
		//	filteritApp.frame.add(nameInput);
		filteritApp.frame.add(usernameInput);
		filteritApp.frame.add(pwdInput);

		// Create a "complete registration" JButton
		JButton completeReg = new JButton("complete registration");
		completeReg.setBounds(110, 340, 280, 40);
		completeReg.setBackground(new Color(157, 156, 184));
		completeReg.setFont(new Font("Ink Free", Font.BOLD, 25));
		filteritApp.frame.add(completeReg);

		// Add an ActionListener that is confirming the user's registration on the app
		completeReg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Get the text that the user is entering into each field
				//String fName = nameInput.getText();
				String fUser = usernameInput.getText();
				String fPwd = pwdInput.getText();

				// Repaint the JFrame and add a JLabel on the button click
				filteritApp.frame.getContentPane();
				filteritApp.frame.repaint();

				// Check the user's account info is valid

				// If the user's name and username is not at least 1 character long or the
				// password is less than 8 characters long, print an error message
				if(fUser.length() < 1 || fPwd.length() < 8) {

					// Set text and design for the error label
					infoError.setText("the info you entered is inavlid, try again!");
					infoError.setBounds(70, 410, 350, 40);
					infoError.setFont(new Font("Ink Free", Font.PLAIN, 20));
					infoError.setForeground(Color.WHITE);

					// Add the error message JLabel to the frame
					filteritApp.frame.add(infoError);

				}

				// Else, save a new account and display a message that informs the user
				// that the sign-up was successful and they can login
				else {
					loginInfo.put(fUser, fPwd);

					//put the new account information into the text file
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
						writer.write(fUser + " " + fPwd+ "\n");

						writer.close();

						// Create a sign-up confirmed JLabel
						confirmedSignUp = new JLabel("You're in! Time to login.");
						confirmedSignUp.setBounds(150, 410, 320, 40);
						confirmedSignUp.setFont(new Font("Ink Free", Font.PLAIN, 20));
						confirmedSignUp.setForeground(Color.WHITE);

						// Remove info error message and repaint the frame
						filteritApp.frame.getContentPane().remove(infoError);
						filteritApp.frame.repaint();

						// Add the sign-up confirmed JLabel to the frame
						filteritApp.frame.add(confirmedSignUp);


					} catch (IOException iox) {
						JOptionPane.showMessageDialog(filteritApp.frame, "Error, please retry.");

					}


					// Create a "back to login" JLabel
					JButton backToLogin = new JButton("back to login");
					backToLogin.setBounds(145, 470, 200, 40);
					backToLogin.setBackground(new Color(210, 224, 193));
					backToLogin.setFont(new Font("Ink Free", Font.BOLD, 25));

					// Add an ActionListener that leads the user back to the login page
					// when the button is clicked
					backToLogin.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

							// Clear and repaint the frame
							filteritApp.frame.getContentPane().removeAll();
							filteritApp.frame.repaint();

							// Link to the login page
							displayLogin();

						}


					});

					// Add the "back to login" JLabel to the frame
					filteritApp.frame.add(backToLogin);

				}
			}


		});


		// Add a "back" JButton that leads the user back to the login page
		JButton bBackLogin = new JButton("back");
		bBackLogin.setBounds(390, 520, 80, 35);
		bBackLogin.setBackground(new Color(135, 145, 161));
		bBackLogin.setFont(new Font("Ink Free", Font.BOLD, 20));

		// Add an ActionListener that leads the user back to the login page when the
		// button is clicked
		bBackLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Clear and repaint the frame
				filteritApp.frame.getContentPane().removeAll();
				filteritApp.frame.repaint();

				// Link to the login page
				displayLogin();

			}

		});

		// Add the "back" JButton to the frame
		filteritApp.frame.add(bBackLogin);

	}

	/**
	 * The following method displays the logout page of the app
	 */
	public static void displayLogout() {

		// Set the design of the JFrame
		filteritApp.frame.setSize(500, 300);
		filteritApp.frame.getContentPane().setBackground(new Color(14, 22, 46));

		// Create a header with a logout message for the user
		JLabel hSuccess = new JLabel("logout successful!");
		hSuccess.setBounds(85, 60, 350, 50);
		hSuccess.setFont(new Font("Ink Free", Font.BOLD, 40));
		hSuccess.setForeground(new Color(157, 170, 209));

		// Create a sub-header for the logout message
		JLabel hLogoutSub = new JLabel("filter it. the you, you want to be.");
		hLogoutSub.setBounds(35, 120, 420, 40);
		hLogoutSub.setFont(new Font("Ink Free", Font.PLAIN, 30));
		hLogoutSub.setForeground(Color.WHITE);

		// Add JLabels to the frame
		filteritApp.frame.add(hSuccess);
		filteritApp.frame.add(hLogoutSub);

	}

}