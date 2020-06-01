package vrietyArray;
import java.util.ArrayList; 
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>programmingLanguages = new ArrayList<>();
        programmingLanguages.add("北海道");
        programmingLanguages.add("東北");
        programmingLanguages.add("関東");
        programmingLanguages.add("中部");
        programmingLanguages.add("近畿");
        programmingLanguages.add("四国");
        programmingLanguages.add("九州");

        for(String language : programmingLanguages){
            System.out.println(language);
        }//インデントのズレ再編集
    }
}