package ex2;

public class Song {
	private String title;//����
	private double price;//����
	private DiscountedMod discountedMod;

	public String getTitle() {
		return title;
	}

	public Song(String title) {//������ �޴� ������ ���߿� ���� �Ұ�
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
