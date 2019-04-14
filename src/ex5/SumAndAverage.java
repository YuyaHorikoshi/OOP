package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {
	private static int count;
	private static int sum;
	private static float ave;

	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("整数を入力してください");

		while (scanner.hasNext()) {
			int list = scanner.nextInt();
			lists.add(list);
		}

		System.out.println("入力された整数値は、");

		for (Integer list : lists) {
			System.out.println(list);
		}

		System.out.println("入力された合計値は、");

		for(int list: lists){
			sum += list;
			count++;
		}

		System.out.println(sum);

		System.out.println("入力された整数の平均値は");

		ave = sum / count;

		System.out.println(ave);

	}
}
