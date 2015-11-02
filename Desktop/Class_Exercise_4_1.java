import javax.swing.JOptionPane;
public class Class_Exercise_4_1
{
	public static void main(String[] args)
	{
		String uInput, pInput;
		
		//pre-set login information
		String corUser = "Matt";
		String corPW = "password";
						 
		uInput = JOptionPane.showInputDialog(null, "Enter username: ");
		pInput = JOptionPane.showInputDialog(null, "Enter password: ");
		
		while(!uInput.equals(corUser) || !pInput.equals(corPW))
		{
			JOptionPane.showMessageDialog(null, "Invalid login. Try again.");
			uInput = JOptionPane.showInputDialog(null, "Enter username: ");
			pInput = JOptionPane.showInputDialog(null, "Enter password: ");
		}	
		while(uInput.equals(corUser) && pInput.equals(corPW))
		{
			JOptionPane.showMessageDialog(null, "Welcome " + uInput + "!");
			uInput = "end";
		}
		
	}
}	
