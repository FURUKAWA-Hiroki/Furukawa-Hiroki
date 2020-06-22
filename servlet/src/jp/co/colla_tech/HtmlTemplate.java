//サーブレット課題3
package jp.co.colla_tech;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task3")
public class HtmlTemplate extends HttpServlet {

    private static String kuji;
	public static void header(PrintWriter out) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=  'UTF - 8'>" );
        out.println("<title>ServletTask </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>↓占い結果↓</p>");
        out.println("</body>");
    }

    public static void footer(PrintWriter out) {
        out.println("<html>");
        out.println("<body>");
        Random rnd = new Random();
        String[] fortune = new String[] {"大吉","中吉","小吉","末吉","凶","大凶"};
        for(int i =0 ; i <= fortune.length ; i++) {
            kuji = fortune[rnd.nextInt(6)];
        }
        out.println("</h1>");
        out.println(kuji);
        out.println("</h1>");

        out.println("</body>");
        out.println("</html>");
    }
    public void doGet (HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        this.doPost(request, response);
    }
}