package branch;
import java.util.Scanner;
    public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1から5までの数字を入力してください");
        String numA = sc.nextLine();
		sc.close();
 
		switch(numA) {
		   case"1": 
		       numA = "-> Ⅰ";
		       break; 
	       case"2":
	           numA = "-> Ⅱ";
	           break; 
	       case"3":
	           numA = "-> Ⅲ";
	           break;
	       case"4":
	           numA = "-> Ⅳ";
	           break;
	       case"5":
	           numA = "->　Ⅴ ";
	           break;
	       default:
	    	   numA = "unknown";
	           break;
	   } 
           System.out.println(numA);   
    } 
}