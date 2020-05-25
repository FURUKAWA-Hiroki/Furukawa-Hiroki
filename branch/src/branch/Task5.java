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

        if(max >= numB) {
            max  = numA;
        }else if(max <=numB){
            max = numB;
        }
        if(max >= numC) {
            max  = numA;
        }else if(max <=numC){
            max = numC;	
        }
        System.out.println("最大値:" + max);
    }
}