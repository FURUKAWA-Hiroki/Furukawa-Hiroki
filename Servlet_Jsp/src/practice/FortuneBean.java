//サーブレット・JSP課題　3,4

package practice;
import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable {
    private Date today;
    private String fortune;

    public FortuneBean() {}

    public Date getToday() {
        return today;
    }
    public void setToday(Date today) {
        this.today = today;
    }
    public String getFortune() {
        return fortune;
    }
    public void setfortune(String fortune) {
        this.fortune = fortune;
    }
}