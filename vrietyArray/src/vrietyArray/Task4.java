package vrietyArray;
import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[] {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
        ArrayList<Integer> oddNum = new ArrayList<Integer>();
        ArrayList<Integer> evenNum = new ArrayList<Integer>();

        for(int i: array) {
            if(i % 2 == 0) {
                evenNum.add(i);
            }else {
                oddNum.add(i);
            }
        }
        HashMap<String,ArrayList<Integer>>attendanceNum  = new HashMap<>();
        attendanceNum.put("奇数",oddNum);
        attendanceNum.put("偶数",evenNum);

        System.out.println("{偶数: ="+ attendanceNum.get("偶数"));
        System.out.print("奇数: =" + attendanceNum.get("奇数}"));
    }
}//再編集