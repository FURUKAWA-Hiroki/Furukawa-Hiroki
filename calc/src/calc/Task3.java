package calc;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x =(a + b + c);
        int y =(x / 3);
        double z =(x / 3.0);
        scanner.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("合計：" + x);
        System.out.println("平均(3で割った時):" + y);
        System.out.println("平均(3.0で割った時):" + z);
    }
}