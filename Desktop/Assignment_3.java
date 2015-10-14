import javax.swing.JOptionPane;
public class Assignment_3
{
	public static void main(String[] args)
	{
		String uInput, pInput;
		int trial = 0;
		int LIMIT = 3;
		
		//loop starter
		int logicCheck = 1;
		//pre-set login information
		String corUser = "student1";
		String corPW = "password1";
		//pre-set account type
		String corAcc = "Student";
				
		String[] choices = { "Admin", "Student", "Staff"};
		
		while(logicCheck == 1)
		{
		String accInput = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		uInput = JOptionPane.showInputDialog(null, "Enter username: ");
		while(!uInput.equals(corUser) && trial<LIMIT)
		{
			trial++;
			JOptionPane.showMessageDialog(null, "Invalid username. Number of login attempts remaining: " + (LIMIT - trial));
			uInput = JOptionPane.showInputDialog(null, "Enter username: ");
		}	
		if(trial<LIMIT)
		{
			pInput = JOptionPane.showInputDialog(null, "Enter password: ");
			while(!pInput.equals(corPW) && trial<LIMIT)
			{
				trial++;
				JOptionPane.showMessageDialog(null, "Invalid password. Number of login attempts remaining: " + (LIMIT - trial));
				pInput = JOptionPane.showInputDialog(null, "Enter password: ");					
			}
			if(trial<LIMIT)
			{
				if(!accInput.equals(corAcc))
				{
					JOptionPane.showMessageDialog(null, "Wrong Account type.");
					logicCheck = 1;
				}
				else
				{
					logicCheck = 2;
					switch(accInput)
					{
					case "Admin":
					JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
					break;
					case "Student":
					JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
					break;
					case "Staff":
					JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
					break;
					}
				}
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Account locked. Contact Admin.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Account locked. Contact Admin.");
		}
		}
	}	
}
	
	