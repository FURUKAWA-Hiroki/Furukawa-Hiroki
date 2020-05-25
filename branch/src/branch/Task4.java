package branch;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA  = sc.nextInt();
        int numB  = sc.nextInt();
        sc.close();

        if(numA > 0 && numB > 0) {
            if(numA % numB ==0){
                System.out.println("numBはnumAの約数です");
            }else{
                System.out.println("numBはnumAの約数ではありません");
            }
        }

        if(numA < 0 || numB < 0) {
            System.out.println("正の整数を入力してください");
        }
    }
}