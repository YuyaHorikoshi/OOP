package ex14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintDic {
	public static void main(String[] args) {
		String filename = "dic.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				String array[] = line.split(",");
				String Eword = array[0];
				String Jword = array[1];
				System.out.println("英単語" + "[" + Eword + "]" + "は、日本語の" + "[" + Jword + "]" + "という意味です。");
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e) {
			System.out.println(e);

		}
	}
}
