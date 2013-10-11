
public class Fruits implements Sale{
	private String name;
	
	public Fruits(String name){
		this.name=name;
	}
	
	public boolean discount(int percent) {
		
		if(percent < Sale.DECREASE_CAP){
			System.out.printf("Today the best price on %s \n", name);
			return true;
			
		} else {
			System.out.printf("Sorry, but this %s not for sale with discount! \n", name);
		    return false;
		}
	}	
}	
	

