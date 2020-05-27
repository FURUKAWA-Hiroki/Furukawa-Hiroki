package loop;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int i = sc.nextInt();
        sc.close();

        int keta = 0;
        while(i > 0){
            keta ++;
            i = i / 10;
        }
        System.out.println("桁数:" + keta);
    }
}