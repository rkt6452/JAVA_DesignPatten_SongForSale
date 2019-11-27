package ex2;

import java.util.ArrayList;
import java.util.List;

public class CartForSong {
	private List<Song> songs = new ArrayList<Song>();//add만 하는 목적으로 만듦
	
	public void addSong(Song s) {
		songs.add(s);
	}//setter의 역활을 한다.
	public double totalprice() {
		double total = 0.0;
		for(Song s : songs) {
			DiscountedMod d = s.getDiscountedMod();
			total += d.getDiscountedprice(s.getPrice());
		}
		return total;
	}
}
//변화되는 모든것을 클래스로 만든다!!!!!!!!!!!!!중요! if 안씀 