package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//・福原先生。前回提出時の際は、
//確認ミスをが不十分で申し訳ございません。
//・フォーマットの指定は課題7問題文に指定がありませんので
//指定して記述する理由をお聞かせ願います。（想定結果の月と日の十の桁に
//0が入っているからでしょうか？）

public class Task7 {
    public static void main(String args[]){
        Date now = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.print("現在日時: ");
        System.out.println(sdf1.format(now));

        Calendar cal = Calendar.getInstance();

        cal.setTime(now);
        cal.add(Calendar.DATE, 7);
        System.out.print("１週間後 : ");
        System.out.println(sdf1.format(cal.getTime()));

        System.out.print("1年後     : ");
        cal.set(2021, 6 ,15);

        System.out.print(cal.get(Calendar.YEAR) + "年");
        System.out.print(cal.get(Calendar.MONTH) + "月");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
        switch(cal.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY:
                System.out.println("(日)");
                break;
            case Calendar.MONDAY:
                System.out.println("(月)");
                break;
            case Calendar.TUESDAY:
                System.out.println("(火)");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("(水)");
                break;
            case Calendar.THURSDAY:
                System.out.println("(木)");
                break;
            case Calendar.FRIDAY:
                System.out.println("(金)");
                break;
            case Calendar.SATURDAY:
                System.out.println("(土)");
                break;
            }
    }
}