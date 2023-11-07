public class NoMoneyException extends Exception {
	public NoMoneyException(){
		super("The balance can't be negative");
	}
}
