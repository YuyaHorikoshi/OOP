package ex4;

import java.util.ArrayList;

public class Deck {
	ArrayList<String> mLists = new ArrayList<String>();
	ArrayList<Integer> nLists = new ArrayList<Integer>();
	private int n;
	private String m;

	private Deck(int i, int j) {
		String m = String.valueOf(i);
		this.n = j;

		switch (m) {
		case "1":
			m = "S";
			break;
		case "2":
			m = "H";
			break;
		case "3":
			m = "C";
			break;
		case "4":
			m = "D";
			break;
		}

		mLists.add(m);
		nLists.add(n);
		for (String mlist : mLists) {
			for (int nlist : nLists) {

				System.out.println(mlist + "," + nlist);
			}
		}
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				Deck aDeck = new Deck(i, j);
			}

		}

	}
}
