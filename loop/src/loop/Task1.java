package loop;
    import java.util.Scanner;
    public class Task1 {
    
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numi = sc.nextInt();  
		    System.out.println("数字を入力してください:" + numi);
		sc.close(); 
		        
		if(numi > 0 && numi == 10) {
		    int sum = 0;
		    for (numi = 1 ; numi <= 10 ; numi++){
		        sum += numi;     
		    } 
		        System.out.println("1~10までの合計 " + sum );
        }
				    else if(numi > 0 && numi == 20){ 
			            int sum = 0;
					    for (numi = 1 ; numi <= 20 ; numi++){
					        sum += numi;    
					    }  
					System.out.println("1~20までの合計 " + sum );   
				   }
    }
}