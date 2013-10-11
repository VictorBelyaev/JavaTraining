
public class Meat implements Sale {
	private String name;
	
	public Meat(String name){
		this.name=name;
	}
	
	public boolean discount(int percent){
        System.out.printf("Huh, %s ended!!! \n",name ); 
       return false;
	} 
	
}
