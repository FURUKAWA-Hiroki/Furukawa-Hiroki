package array;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] num = new int [6];
        System.out.print("[");

        int max = 0;
        int min = 10;
        for(int i = 0; i < num.length ;i++){
            num[i] = rnd.nextInt(10);
        }

        for(int i = 0; i < num.length; i++) {
            if(i < num.length -1){
                System.out.print(num[i] + ",");
            }else{
                System.out.print(num[i]);
            }

            if(max < num[i]){
                max = num[i];
            }else if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("]");
        System.out.println("最大値:" + "" + max);
        System.out.println("最小値:" + "" + min);
    }
} //保存用　保存用