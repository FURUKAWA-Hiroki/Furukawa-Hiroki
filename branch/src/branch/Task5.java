package branch;
import java.util.Scanner;
    public class Task5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		sc.close();
 
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		System.out.println("numC:" + numC);
   
		int max = numA;
		String resultA1 = (max >= numB)? "最大値;" + numA: "最大値" + numB;
 		    System.out.println(resultA1);
		
 		String resultA2 = (max >= numC)? "最大値;" + numA: "最大値" + numC;
 		    System.out.println(resultA2);
    } 
}