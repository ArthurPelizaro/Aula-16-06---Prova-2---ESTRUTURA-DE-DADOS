import javax.swing.JOptionPane;

public class Ex4_24
{
	public static void main ( String args [] )
	{
		int number,		
			n1,			
			n2,			
			n3,			
			n4,			
			n5;			
		double num = 0;
		
		number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
		
		while ( number > 99999 )
		{
			JOptionPane.showMessageDialog ( null, "O número possui mais de cinco dígitos!");
			
			number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			
			while ( number <= 9999 )
			{
				JOptionPane.showMessageDialog ( null, "O número possui menos de cinco dígitos!");
				
				number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			}
			
		}
		
		while ( number <= 9999 )
		{
			JOptionPane.showMessageDialog ( null, "O número possui menos de cinco dígitos!");
			
			number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			
			while ( number > 99999 )
			{
				JOptionPane.showMessageDialog ( null, "O número possui mais de cinco dígitos!");
				
				number = Integer.parseInt (JOptionPane.showInputDialog ("Digite um número com 5 digitos: "));
			}
			
		}		
		n1 = number / 10000;												
		n2 = (number / 1000) - (n1 * 10); 									
		n3 = (number / 100) - (n1 * 100) - (n2 * 10);						
		n4 = (number / 10) - (n1 * 1000) - (n2 * 100) - (n3 * 10);			
		n5 = number - (n1 * 10000) - (n2 * 1000) - (n3 * 100) - (n4 * 10);	
		
		if (n1 == n5)
		{
			if (n2 == n4)
			{
				JOptionPane.showMessageDialog ( null, "O número digitado é um palíndromo!");
			}
			else
			{
				JOptionPane.showMessageDialog ( null, "O número digitado não é um palíndromo!");
			}
		}
		else
		{
			JOptionPane.showMessageDialog ( null, "O número digitado não é um palíndromo!");
		}
		
		System.exit ( 0 );
		
	}
}