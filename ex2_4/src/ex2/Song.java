package ex2;

public class Song {
	private String title;//제목
	private double price;//가격
	private DiscountedMod discountedMod;

	public String getTitle() {
		return title;
	}

	public Song(String title) {//제목을 받는 생성자 나중에 수정 불가
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public DiscountedMod getDiscountedMod() {
		return discountedMod;
	}

	public void setDiscountedMod(DiscountedMod discountedMod) {
		this.discountedMod = discountedMod;
	}
	
	
}
