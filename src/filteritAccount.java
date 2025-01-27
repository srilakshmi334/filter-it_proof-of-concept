// Import the following packages:
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The following class checks and stores user accounts
 * @author Sri
 *
 */
public class filteritAccount {

	// Class variables
	static String name;
	static String user;
	static String pwd;

	/**
	 * The following constructor method stores the user's account information
	 * @param name
	 * @param username
	 * @param password
	 */
	public filteritAccount(String name, String username, String password) {

		// Object referencing
		filteritAccount.name = name;
		filteritAccount.user = username;
		filteritAccount.pwd = password;

	} // End of filteritAccount() constructor

	/**
	 * The following method gets the user's name information
	 * @return name
	 */
	/*public String getNameInfo() {           						!!!SEE IF NAME CAN BE STORED IN HASHMAP!!!
	 * 		return name;
	}*/

	/**
	 * The following method checks the user's login information with their sign-up
	 * @param enterName
	 * @param enterUser
	 * @param enterPwd
	 * @return true if login info is valid, false if it is invalid
	 */

	public static boolean confirmInfo(String enterName, String enterUser, String enterPwd) {

		// Using a try/catch statement to check if the sign-up and login info match

		// If the user's information matches, return true
		try {
			if (name.equals(enterName) && user.equals(enterUser) && pwd.equals(enterPwd)) {
				return true;
			}

			// If the user information cannot be accessed, return false
		} catch(NullPointerException e) {
			return false;
		}

		// If the user's information does not match, return false
		return false;

	} // End of confirmInfo() method

}