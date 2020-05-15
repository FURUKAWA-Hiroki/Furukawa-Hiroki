package branch;
import java.util.Scanner;
    public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		int numD = sc.nextInt();
		int numE = sc.nextInt();
		sc.close();

        int intX = numA | numB | numB | numC | numD;
		
		switch(intX) {
		   case 1 -> "I";
	       case 2 -> "Ⅱ";
	       case 3 -> "Ⅲ";
	       case 4 -> "Ⅳ";
	       case 5 -> "Ⅴ";
	       default -> "unknown";
	           break;
	    }
		System.out.println("1から5までの数字を入力してください");
     }
}