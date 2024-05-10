package cop2805;

public class FirstClass
{
	public static void main(String[] args)
	{
		int increment = 1000; // Value that will act as an update in the while loop.
		double sales = 1000;
		while (sales <= 20000) // Set the condition for the loop to end at 20000.
		{
			System.out.println("$" + sales + "-----" + "$" + computeIncome(sales));
			sales = sales + increment;

			/* The system will print the value of sales, and a space in between it and the
			 computed income. The computeIncome method is called to calculate the income
			 of the current sales value.*/
		}

	}

	public static double computeIncome(double salesAmount)
	{
		if (salesAmount > 0 && salesAmount <= 5000)
		{
			salesAmount = (salesAmount * 0.08) + 5000;
		}
		else if (salesAmount > 5000 && salesAmount <= 10000)
		{
			salesAmount = (5000 * 0.08) + ((salesAmount - 5000) * 0.1) + 5000;
		}
		else if (salesAmount > 10000)
		{
			salesAmount = (5000 * 0.08) + (5000 * 0.1) +
					((salesAmount - 10000) * 0.12) + 5000;
		}
		return salesAmount;

		// The if conditions will determined the tier in which the sales falls into
		// and return the computed value.
	}

}
