package standardClass;
public class Task5 {
    public static void main(String[] args) {
        String aStr = "cat_mouse_mouse_cat_cat";

        String [] aray1 = aStr.split("_");
        int countCat = 0;
        int countMouse = 0;
        for(String bStr : aray1) {
            //System.out.println(bStr);
            if(bStr.equals("cat")) {
                countCat++;
            }else{
                countMouse++;
            }
        }
        System.out.print(countCat);
        System.out.println("," + countMouse);

        if(countCat > countMouse) {
            System.out.println("catの方が大きい");
        }
    }
}