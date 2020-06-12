package standardClass;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Task6 {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/mm/dd HH:mm");

        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));
    }
}