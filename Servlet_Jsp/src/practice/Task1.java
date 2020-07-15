//サーブレット・JSP課題1

package practice;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1")
public class Task1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException {
            request.getRequestDispatcher("WEB-INF/index.jsp");
            response.setContentType("text/html; charset = UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=  'UTF-8' >" );
            out.println("<title>Servlet-Jsp Task </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello Servret</h1>");
            out.println("</body>");
            out.println("</html>");
    }
}