
public class TestSale {

	public static void main(String[] args) {
		GoogleTextToSpeech gtts = new GoogleTextToSpeech();
		Sale goods[] = new Sale[4];
			goods[0] = new Fruits("Apples");
			goods[1] = new Meat("Beef");
			goods[2] = new Vegetables("Tomatoes");
			goods[3] = new Fruits("Lemons");
		
			gtts.say("Sale, Sale" , "en");
			gtts.say("Big discount" , "en");
			
				for (Sale p: goods){
					   p.discount(30);
				}
		}
}
