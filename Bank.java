public class Bank {
	private String name;

	public Bank(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public <T, S> S transfert(Account<T> myAccount, Account<S> otherAccount, int amount) {
        if(myAccount.getAmount()>= amount){
			myAccount.removeMoney(amount);
			otherAccount.addMoney(amount);
			System.out.println(myAccount.getOwner() + " sent to " + otherAccount.getOwner() + " " + amount + " " + myAccount.getCurrency());
		}
		else{
			System.err.println("Transaction is impossible !");
		}

		return otherAccount.getCurrency();
    }
}