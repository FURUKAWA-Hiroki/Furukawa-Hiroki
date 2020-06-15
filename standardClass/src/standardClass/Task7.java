package standardClass;
import java.util.Calendar;

public class Task7 {
    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();
        System.out.print("現在日時: ");
        cal.getTime();
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print(cal.get(Calendar.MONTH) + "月");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");

        System.out.print("１週間後 : ");
        cal.add(Calendar.DAY_OF_MONTH ,7);
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print(cal.get(Calendar.MONTH) + "月");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "日");

        System.out.print("1年後     : ");
        cal.set(2021, 5 ,12);
        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print(cal.get(Calendar.MONTH) + "月");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
        switch(cal.get(Calendar.DAY_OF_WEEK) ) {
            case 1:
                System.out.println("(日)");
                break;
            case 2:
                System.out.println("(月)");
                break;
            case 3:
                System.out.println("(火)");
                break;
            case 4:
                System.out.println("(水)");
                break;
            case 5:;
                System.out.println("(木)");
                break;
            case 6:
                System.out.println("(金)");
                break;
            case 7:
                System.out.println("(土)");
                break;
        }
    }
}