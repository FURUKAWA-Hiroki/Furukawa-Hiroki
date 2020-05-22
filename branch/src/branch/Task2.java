package branch;
import java.util.Scanner;
    public class Task2 {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int numberA = scanner.nextInt();
        System.out.println("数字を入力してください");
        System.out.println(numberA);
	    scanner.close();
	          
	    if(numberA < 10) {
	        System.out.println("値:0" + numberA);
	    }else if(numberA < 0) {
	        System.out.println("値:" + numberA);
	    }    
    }
} 