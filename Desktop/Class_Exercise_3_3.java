import java.util.Scanner;

public class UserLogin 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String username, password, username2, password2;
		
		System.out.println("Create a username: ");
		username = keyboard.next();
		System.out.println("Create a password: ");
		password = keyboard.next();
		System.out.println("Your login information has been saved. Please login.");
		
		System.out.println("Enter your username: ");
		username2 = keyboard.next();
		System.out.println("Enter your password: ");
		password2 = keyboard.next();
		
		if(username2.equals(username) && password2.equals(password))
		{
			System.out.println("Welcome " + username + "!");
		}	
		else
		{
			System.out.println("Wrong Username or Password!");
		}
	}
	
}
