package ex4;

public class Ticket {
	private static int count=1;
	private int number;

	public Ticket() {
		number=count;
		count++;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return "Ticket(" + getNumber() + ")";
	}
}
