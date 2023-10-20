import java.util.Comparator;

public class PriceComparator implements Comparator<Toy>{

	@Override
	public int compare(Toy toy1, Toy toy2) {
		// if(toy1.getPrice() < toy2.getPrice()){
		// 	return -1;
		// }else{
		// 	return 1;
		// }
		//return toy1.getPrice() - toy2.getPrice();
		if(toy1.getPrice() == toy2.getPrice()){
			//return toy1.getName().compareTo(toy2.getName());
			return toy1.compareTo(toy2);
		}
		
		return toy2.getPrice() - toy1.getPrice();
	}
	
}
