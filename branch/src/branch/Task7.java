package branch;
import java.util.Scanner;
    public class Task7{
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         String 月曜 = sc.nextLine();
         String 火曜 = sc.nextLine();
         String 水曜 = sc.nextLine();
         String 木曜 = sc.nextLine();
         String 金曜 = sc.nextLine();
         String 土曜 = sc.nextLine();
         String 日曜 = sc.nextLine();
         sc.close();

         String strA = "午前診療と午後診療があります";
         String strB = "土曜は午前診療のみです";
         String strC = "日曜は休診です";
         String strD = "unknown";

         String week = 月曜 + 火曜 + 水曜 + 木曜 + 金曜 + 土曜 + 日曜;
         int numLetters = 0;
          
     switch(week) {
 	    case "月曜","火曜","水曜","木曜","金曜" -> strA 
 	        break;
 	    case "土曜" -> strB
 	        break;
 	    case "日曜" -> strC
 	        break;
 	    default -> strD
 	        break;
    }    
    System.out.println("病院に行く曜日を選択してください");
    }
}