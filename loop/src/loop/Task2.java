package loop;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numi = sc.nextInt();  
            System.out.println("数字を入力してください:" + numi);
        sc.close(); 
        
        if(numi > 0 && numi == 5) {
            int sum = 0;
		    for (numi = 1 ; numi <= 5 ; numi++){
		    sum += numi;     
		    } 
		    System.out.println("1 + 2 + 3 + 4 + 5 = " + sum );
        }
		    else if(numi > 0 && numi == 10){
	            int sum = 0;
			    for (numi = 1 ; numi <= 10 ; numi++){
			        sum += numi;    
			    }  
			System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = " + sum );   
		    }
    } 
} 