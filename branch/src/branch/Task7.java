package branch;
import java.util.Scanner;
    public class Task7{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("病院に行く曜日を選択してください");
		System.out.println("【日曜,月曜,火曜,水曜,木曜,金曜,土曜】");
        String strA = sc.nextLine();
        sc.close();
      
        switch(strA) {
 	        case"月曜":
 	            strA = "午前診療と午後診療があります";     
 	        case"火曜":
 	        case"水曜":
 	        case"木曜":
 	        case"金曜":
 	            break;        
 	        case"土曜": 
 	            strA = "土曜は午前診療のみです"; 
 	            break;
 	        case"日曜":
 	            strA = "日曜は休診です";
 	            break;
 	        default:
 	    	    strA = "入力を確認してください";
 	            break;
        }    
        System.out.println(strA);
    }
}