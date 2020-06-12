package standardClass;
public class Task2 {
    public static void main(String[] args) {
        String text1 ="Java Programming Training";
        if(text1.indexOf("Training") >= 0){
            System.out.println("\"Training\"");
            System.out.println("\"Java Programming\"");
        }
        String substr1 = text1.substring(16);
        System.out.println(substr1);
        String substr2 = text1.substring(0,16);
        System.out.println(substr2);
    }
}