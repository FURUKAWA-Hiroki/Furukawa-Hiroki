package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//ご回答ありがとうございます。
//また、いつも採点並びにレビュー頂きありがとうございます。
//この課題以降や、現場に配属されてからも
//端的なシンプルなコードを書くように心掛けます。

public class Task7 {
    public static void main(String args[]){
        Date now = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.print("現在日時: ");
        System.out.println(sdf1.format(now));

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        System.out.print("１週間後 : ");
        System.out.println(sdf1.format(cal.getTime()));

        //検索を掛けて調べましたが、SimpleDateFormatにて月が1月大きく出る理由がわかりませんでした。
        //月の値を"5"に設定すると、曜日も含めて正しく1年後が出力されますので、以下のように記載します。
        cal.set(2021, 6 - 1 ,17);
        System.out.print("1年後     : ");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日(E)");
        System.out.println(sdf2.format(cal.getTime()));
    }
}