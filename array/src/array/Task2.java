package array;
public class Task2 {

    public static void main(String[] args) {
        
         int[]m = new int[7];
         for(int i = 0; i < m.length; i++) {
            
        }
         for(int j = 0; j < m.length; j++) {
             if(j == m .length-1) {
                System.out.println(m[j]);
            }else {
                System.out.print(m[j] + ",");
            }
        }

        for(int n = m.length; n >=0; n--) {
            if(n == 1) {
                System.out.print(m[n--]);
            }else {
                System.out.print(m[n-1] + ",");
            }
        }
    }
}
