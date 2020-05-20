package array;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
	    Random rnd = new Random();
	    int[] num = new int[5];
	    System.out.print("[");
	    int max = 0,min =9999;
	    for(int i = 0; i < num.length;i++){
	    	num[i] = rnd.nextInt(10);
	    }
	    for(int i = 0; i <=4; i++) {
	    	if(i <=3) {
	    		System.out.print(num[i] + ",");
	    	}else {
	    		System.out.println(num[i] + "]");
	    	}
	        if(max < num[i]) {
	    	    max = num[i];
	        }
	        if(min >num[i]) {
	        	min = num[i];
	        }
	    }
	    System.out.println("最大値:" + "" + max);
	    System.out.println("最小値;" + "" + min);

	}
}