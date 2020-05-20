package loop;
import java.util.Scanner;
    public class Task4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
             System.out.println("正の整数を入力してください:" + i);
        sc.close();

        int v = 0;

        for(v =1; v <= i; v++ ) {
				if( i % v == 0 ) {
				    System.out.print(v + "," );
				}
	    }
    }
}