package loop;
import java.util.Scanner;
    public class Task4 {
    public static void main(String[] args) {
        System.out.print("正の整数を入力してください:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0) {
            System.out.print(n + "の約数:");
            sc.close();

            for(int i =1; i < n; i++ ) {
                if(n % i == 0 ) {
                    System.out.print(i + ",");
                }
            }
        }
        System.out.print(n);
    }
} 