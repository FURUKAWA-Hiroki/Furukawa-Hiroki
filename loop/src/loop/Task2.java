package loop;
import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
    	System.out.print("数字を入力してください: ");
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        sc.close();
        System.out.println(numA);

        int sum = 0;
        for(int i = 1 ; i <= numA; i ++){
            sum += i ;
            System.out.print(i + " + ");

            if(i == numA){
                System.out.println(" = " + sum);
            }
        }
    }
}//再提出のためのコメント