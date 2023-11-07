public class Toy implements Comparable<Toy>{
	
	private String name;
	private int price;
	private String descr;
	private int promo;

	public Toy(String name, int price, String descr, int promo){
		this.name = name;
		this.price = price;
		this.descr = descr;
		this.promo = promo;
	}

	public String getName(){
		return name;
	}

	public int getPrice(){
		return price;
	}

	public String getDescr(){
		return descr;
	}

	public int getPromo(){
		return promo;
	}

	@Override
	public int compareTo(Toy toy2) {
		if(this.promo > toy2.getPromo()){
			return -1;
		}else{
			return 1;
		}
	}

}
