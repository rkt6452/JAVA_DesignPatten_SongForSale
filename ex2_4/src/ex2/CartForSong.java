package ex2;

import java.util.ArrayList;
import java.util.List;

public class CartForSong {
	private List<Song> songs = new ArrayList<Song>();//add�� �ϴ� �������� ����
	
	public void addSong(Song s) {
		songs.add(s);
	}//setter�� ��Ȱ�� �Ѵ�.
	public double totalprice() {
		double total = 0.0;
		for(Song s : songs) {
			DiscountedMod d = s.getDiscountedMod();
			total += d.getDiscountedprice(s.getPrice());
		}
		return total;
	}
}
//��ȭ�Ǵ� ������ Ŭ������ �����!!!!!!!!!!!!!�߿�! if �Ⱦ� 