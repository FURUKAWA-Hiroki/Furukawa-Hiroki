package standardClass;
import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        String aStr= "ABCDGOPQRSYZ";
        Scanner sc = new Scanner(System.in);
        String bStr = sc.nextLine();
        System.out.println("探したい文字:" + bStr);
        sc.close();

        if(aStr.indexOf(bStr) >= 0 ){
            System.out.println("ABCDGOPQRSYZは"+ bStr + "を含む");
        }else{
            System.out.println("ABCDGOPQRSYZは" + bStr + "を含まない");
        }
    }
}