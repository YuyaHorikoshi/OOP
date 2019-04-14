package ex00;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressBook1{

	public static void main(String[] args){
		AddressBook1 book = new AddressBook1();
	    System.out.println("ファイルから読み込む。");
	    book.open("address.txt");
	    System.out.println("一覧の表示。");
	    book.showAddresses();
	    System.out.println("新規データの追加。");
	    Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
	    book.add( taroAddress );
	    System.out.println("一覧の表示。");
	    book.showAddresses();
	    System.out.println("ファイルに書き出す。");
	    book.save("address2.txt");
	}
	ArrayList<Address> list = new ArrayList<Address>();
	AddressBook1(){

	}

	public void add(Address address){
		list.add(address);
	}

	public void showAddresses(){
		 for(Address list1 : list){
		 	System.out.println("list1.toString");
		 }
	}

	public void open(String filename){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
	        String line1;
	        while ((line1 = reader.readLine()) != null) {
	        	String[] part = line1.split(",");
	        	Address	adr = new Address(part[0],part[1],part[2],part[3]);
	    	}
		} catch (FileNotFoundException e) {
	        System.out.println(filename + "が見つかりません。");
	    } catch (IOException e) {
	        System.out.println(e);
	    }
	}

	public void save(String filename){
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			String line2;
			while ((line2 = reader.readLine()) != null) {
				writer.println(line2);
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}