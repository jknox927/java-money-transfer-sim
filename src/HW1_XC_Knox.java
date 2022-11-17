import java.util.Scanner;

public class HW1_XC_Knox 
{
	public static void main(String[] args) 
	{
		//declarations:
		double euro = 0.97;
		double yuan = 6.93;
		double peso = 19.97;
		double yen = 140.37;
		double FEE = 0.03;
		double dollars = 0.0;
		double total = 0.0;
		double charge = 0.0;
		double currency = 0.0;
		String continueLoop;
		int menuOption;
		
		//custom message declarations:
		String errMsg = "The amount you entered is not accepted\n" +
						"Transfer amount must be greater than or equal to 100USD";
		String menuMsg = "Select a currency transfer option:" +
						"\n0) Euro" +
						"\n1) Yuan" +
						"\n2) Peso" +
						"\n3) Yen";
		String inputMsg = "\nEnter a transfer amount:";
		
		/* Originally, I wanted this message to display as its own entity rather than directly inputting the entire string message
		 * within each switch case. Is there a way to do this where my values display the stored input rather than zero? Currently, when I input this message
		 * as its own item, it displays zero for each variable value. Let me know how to fix this, thank you!
		*String displayMsg = "Transaction Details:" +
							"\nTransfer Amount: " + dollars +
							"\nExchange Amount: " + charge +
							"\nTotal: " + total;
		*/
		
		//create a scanner:
		Scanner get = new Scanner(System.in);
		
		//display welcome message:
		System.out.println("Welcome to Java Money Transfer Simulation ATM\n" +
							"This ATM charges a 3% fee on all transactions\n" +
							"Accepted transfer amounts must exceed 100USD\n");
		
		//receive an input: 
		do
		{
			do
			{
				System.out.println(menuMsg);
				menuOption = get.nextInt();
				
				switch (menuOption)
				{	
					case 0: System.out.println(inputMsg);
							dollars = get.nextDouble();
							charge = dollars * FEE;
							total = dollars + charge;
							currency = dollars * euro;
							System.out.println("\nTransaction Details:" +
									"\nTransfer Amount: $" + dollars +
									"\nCharge Fee (3%): $" + charge +
									"\nExchange Amount: " + currency +
									"\nTotal (USD): $" + total);
							break;
					
					case 1: System.out.println(inputMsg);
							dollars = get.nextDouble();
							charge = dollars * FEE;
							total = dollars + charge;
							currency = dollars * yuan;
							System.out.println("\nTransaction Details:" +
									"\nTransfer Amount: $" + dollars +
									"\nCharge Fee (3%): $" + charge +
									"\nExchange Amount: " + currency +
									"\nTotal (USD): $" + total);
							break;
				
					case 2: System.out.println(inputMsg);
							dollars = get.nextDouble();
							charge = dollars * FEE;
							total = dollars + charge;
							currency = dollars * peso;
							System.out.println("\nTransaction Details:" +
									"\nTransfer Amount: $" + dollars +
									"\nCharge Fee (3%): $" + charge +
									"\nExchange Amount: " + currency +
									"\nTotal (USD): $" + total);
							break;
						
					case 3: System.out.println(inputMsg);
							dollars = get.nextDouble();
							charge = dollars * FEE;
							total = dollars + charge;
							currency = dollars * yen;
							System.out.println("\nTransaction Details:" +
									"\nTransfer Amount: $" + dollars +
									"\nCharge Fee (3%): $" + charge +
									"\nExchange Amount: " + currency +
									"\nTotal (USD): $" + total);
							break;
							
					default: System.out.println(errMsg);
				}
			}
			while (menuOption > 3);
			
			System.out.println("\nEnter Y to continue and N to quit: ");
			continueLoop = get.next();
		}
		while ((continueLoop.equals("Y") || (continueLoop.equals("y"))));
		
	}//end main

}//end class HW1_Knox