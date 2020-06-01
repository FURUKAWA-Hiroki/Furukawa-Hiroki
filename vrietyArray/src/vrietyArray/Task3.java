package vrietyArray;

import java.util.HashMap;

public class Task3 {
	public static void main(String[] args) {
        HashMap<Integer,String>attendanceNum = new HashMap();
        attendanceNum.put(1,"りんご");
        attendanceNum.put(2,"メロン");
        attendanceNum.put(3,"みかん");
        attendanceNum.put(4,"バナナ");
        
        attendanceNum.keySet();
        System.out.println(attendanceNum.get(1)  + ":130円");
        System.out.println(attendanceNum.get(2)  + ":6000円");
        System.out.println(attendanceNum.get(3)  + ":120円");
        System.out.println(attendanceNum.get(4)  + ":98円");
	}

}
