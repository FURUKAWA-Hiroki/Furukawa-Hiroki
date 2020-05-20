package array;
public class Task1 {
    public static void main(String[] args) {

	    int[]array = new int[] {4,9,19,5,8,21,42,64,73,18,2};
		    System.out.println("配列:{");
		
		for(int i = 0; i < array.length; i++) {
        
		    if(array[i] > array[10]) {
			    System.out.print(array[i] + "," );
		    }else {
		        System.out.println(array[10] + "]");
		    }
	    }

		int sum = 0;
		for(int b : array) {
	        sum += b;
	    }
	    System.out.println("合計:" + sum);
    }
}