package cse360assign3;
/**
 * Class to simulate a calculator and record input
 * @author Nicholas Miller
 * class pin 606
 * @version 2/22/2016
 */
public class Calculator {

	private int total;
	/**
	 * Creates a calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
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
	}
	/**subtract() subs value from total
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	/**multiply() multiplies total by value
	 * 
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
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
	}
	/** getHistory() returns all input with a " " between
	 * each operand and number
	 * 
	 * @return input string
	 */
	public String getHistory () {
		return "";
	}
}
