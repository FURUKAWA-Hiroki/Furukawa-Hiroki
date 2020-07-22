//サーブレット・JSP課題4
package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task4")
public class Task4 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException,IOException {

        Date today = new Date();
        Random rnd = new Random();

        String[] kuji = {"大吉","中吉","小吉","末吉","凶","大凶"};
            String fortune = kuji[rnd.nextInt(6)];

        FortuneBean fortuneData = new FortuneBean();
        fortuneData.setToday(today);
        fortuneData.setfortune(fortune);
        request.setAttribute("Data", fortuneData);

        request.getRequestDispatcher("WEB-INF/jsp/fortune_result.jsp").forward(request,response);
    }
} //上書き保存用