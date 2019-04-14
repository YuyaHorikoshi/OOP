package ex13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressBook {
	ArrayList<Address> book;

	public AddressBook() {
		book = new ArrayList<Address>();
	}

	public void add(Address address) {
		book.add(address);
	}

	public void showAddress() {
		for (Address show : book) {
			System.out.println(show.toString());
		}
	}

	public void open(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String words;
			while ((words = reader.readLine()) != null) {
				String[] word = words.split(",");
				Address ad = new Address(word[0], word[1], word[2], word[3]);
				book.add(ad);

			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void save(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			String words;
			while ((words = reader.readLine()) != null) {
				writer.println(words);
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		System.out.println("ファイルから読み込む。");
		book.open("address.txt");
		System.out.println("一覧の表示。");
		book.showAddress();
		System.out.println("新規データの追加。");
		Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
		book.add(taroAddress);
		System.out.println("一覧の表示。");
		book.showAddress();
		System.out.println("ファイルに書き出す。");
		book.save("address2.txt");

	}

}
