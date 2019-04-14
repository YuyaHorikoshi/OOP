package chap13;

import java.io.*;

public class DisplayFile {
    public static void main(String[] args) {
        for (String filename : args) {
            System.out.println("ファイル名 " + filename + "====");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません：" + e);
            } catch (IOException e) {
                System.out.println("I/Oエラーです：" + e);
            }
        }
    }
}
