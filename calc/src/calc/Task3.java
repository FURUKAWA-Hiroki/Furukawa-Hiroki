package calc;
import java.util.Scanner;

public class Task3 {
      public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

    	Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X =(A + B + C);
        int Y =(X / 3);
     double Z =(X / 3.0);
        scanner.close();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println("合計：" + X);
        System.out.println("平均(3で割った時):" + Y);
        System.out.println("平均(3.0で割った時):" + Z);
      }
}
