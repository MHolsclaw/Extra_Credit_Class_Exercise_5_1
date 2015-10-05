import javax.swing.JOptionPane;
public class Class_Exercise_3_6 
{ 
	public enum Months {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) 
	{ 
		Months[] choices = {Months.January, Months.February, Months.March, Months.April, Months.May, Months.June, Months.July, Months.August, Months.September, Months.October, Months.November, Months.December}; 
        Months input = (Months) JOptionPane.showInputDialog(null,"Select the month.", "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]); 
        while (input!=null) 
        { 
        switch(input)
        {
        case January: case February: case December:
        JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
        break;
        case March: case April: case May:
        JOptionPane.showMessageDialog(null, "Happy Spring days!");
        break;
        case June: case July: case August:
        JOptionPane.showMessageDialog(null, "It's a summer time.");
        break;
        case September: case October: case November:
       	JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
       	}
        input = (Months) JOptionPane.showInputDialog(null,"Select the month.", "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
        } 
	}
}