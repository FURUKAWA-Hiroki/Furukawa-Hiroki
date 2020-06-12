package standardClass;
import java.util.Scanner;
public class Task4{
    public static void main(String[] args) {
        String aStr= "ABCDGOPQRSYZ";
        Scanner sc = new Scanner(System.in);
        String bStr = sc.nextLine();
        System.out.println("探したい文字:" + bStr);
        sc.close();
        //System.out.println(aStr.length());

        String[] strAray = aStr.split("_");
        for(int i = 0; i < strAray.length; i++){
            //System.out.println(strAray[i]);
            if(aStr.indexOf(strAray[i]) >= 0 ){
                System.out.println("ABCDGOPQRSYZは"+ bStr + "を含む");
            }else{
                System.out.println("ABCDGOPQRSYZは" + bStr +"を含まない");
            }
        }
    }
}   