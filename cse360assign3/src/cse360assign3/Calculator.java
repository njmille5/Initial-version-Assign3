package cse360assign3;
/**
 * Class to simulate a calculator and record input
 * @author Nicholas Miller
 * class pin 606
 * @version 2/22/2016
 */
public class Calculator {
	private String history;
	private int total;
	/**
	 * Creates a calculator to use
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
		
	}
	/**access method
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/**add() add value to total
	 * 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	/**subtract() subs value from total
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	/**multiply() multiplies total by value
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	/**divide() divides total by value
	 * 
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
		history += " / " + value;
	}
	/** getHistory() returns all input with a " " between
	 * each operand and number
	 * 
	 * @return input string
	 */
	public String getHistory () {
		return history;
	}
}
