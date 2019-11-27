package ex2;

public class Main {

	public static void main(String[] args) {
		DiscountedMod notdis = new NotDiscounted();
		DiscountedMod onsale = new OnSale();
		DiscountedMod todaye = new TodayEvent();
		
		Song s1 = new Song("BTS");
		s1.setPrice(1000.0);
		s1.setDiscountedMod(notdis);
		
		Song s2 = new Song("ITZY");
		s2.setPrice(2000.0);
		s2.setDiscountedMod(todaye);
		
		Song s3 = new Song("EXO");
		s3.setPrice(2000.0);
		s3.setDiscountedMod(onsale);
		
		CartForSong cart = new CartForSong();
		cart.addSong(s1);//Ãß°¡
		cart.addSong(s2);
		cart.addSong(s3);

		
		System.out.println(cart.totalprice());
	}

}
