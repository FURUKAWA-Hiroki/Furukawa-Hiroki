package vrietyArray;
import java.util.ArrayList;
public abstract class Task2 {
    public static void main(String[] args) {

        int[] array = new int[] {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
        ArrayList<Integer> oddNum = new ArrayList<Integer>();
        ArrayList<Integer> evenNum = new ArrayList<Integer>();

        System.out.print( "奇数： ");

        for(Integer ary :array) {
            if(ary % 2 != 0) {
                oddNum.add(ary);
            }else if(ary  % 2 ==0) {
                evenNum.add(ary);
            }
        }
        System.out.println(oddNum);
        System.out.print( "偶数： ");
        System.out.println(evenNum);
    }
}