package vrietyArray;
import java.util.HashMap;
public class Task3 {
    public static void main(String[] args) {
        HashMap<String,String>attendanceNum = new HashMap<String, String>();
        attendanceNum.put("りんご", ":130円");
        attendanceNum.put("メロン", ":6000円");
        attendanceNum.put("みかん", ":120円");
        attendanceNum.put("バナナ", ":98円");

        for(HashMap.Entry<String,String> fruit: attendanceNum.entrySet()) {
            System.out.print(fruit.getKey());
            System.out.println(fruit.getValue());
        }
    }//インデントのズレ再編集編集
}