
public class Vegetables implements Sale{
	private String name;
	
	public Vegetables(String name){
		this.name=name;
	}
	
	public boolean discount(int percent) {
        System.out.println("Discount on " + name 
        		+" - " + percent + "% "); 
        return true;
	}	
}
