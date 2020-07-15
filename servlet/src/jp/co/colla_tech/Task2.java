//サーブレット課題2
package jp.co.colla_tech;
import java.io.IOException;
import java.io.PrintWriter;
import  java.text.SimpleDateFormat ;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task2")
public class Task2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>Servlet Task </title>");
        out.println("</head>");
        out.println("<body>");
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        out.print("<h1>今日の日付: " + sdf.format(now));
        out.print("</body>");
        out.print("</html>");
    }
} // //上書き保存のための文字列