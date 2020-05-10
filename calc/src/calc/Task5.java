package calc;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String A =("ノートPCの値段:");
		   int B =(89800);
		String JPY =("円");

		System.out.println(A + B + JPY);

		Scanner scanner = new Scanner(System.in);
        String C = scanner.nextLine();
		String D = scanner.nextLine();
		scanner.close();

		System.out.println(C);
		System.out.println(D);
		System.out.println(C + D);

	}

}