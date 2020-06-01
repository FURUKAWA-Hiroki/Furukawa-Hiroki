package vrietyArray;
import java.util.ArrayList;
public abstract class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        numbers.add(21);
        numbers.add(3);
        numbers.add(32);
        numbers.add(6);
        numbers.add(99);
        numbers.add(72);
        numbers.add(78);
        numbers.add(51);
        numbers.add(1);
        numbers.add(26);
        numbers.add(87);
        numbers.add(11);
        numbers.add(48);
        numbers.add(60);
 
        System.out.print( "奇数：  [");
        for(Integer oddNum  : numbers) {
            if(oddNum % 2 != 0) {
                System.out.print(oddNum + ",");
            }
        }
        System.out.println("]");

        System.out.print("偶数: [");

        for(Integer evenNum  : numbers) {
            if(evenNum % 2 == 0) {
            System.out.print(evenNum + ",");
            }
        }
        System.out.print("]");
    }//インデントのズレ再編集
}