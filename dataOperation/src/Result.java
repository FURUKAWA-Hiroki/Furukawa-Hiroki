//データ操作・課題1 (ファイル02)

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    //リクエストパラメータの文字コードを指定
    request.setCharacterEncoding("UTF-8");

    //リクエストパラメータを取得
    String name2   = request.getParameter("name");
    String gender2 = request.getParameter("gender");
    String select2 = request.getParameter("select");
    String textbox2 = request.getParameter("textbox");

    //想定画面02を出力
    response.setContentType("text/html; charset = UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset= UTF-8>");
    out.println("<title>想定画面02</title>");
    out.println("</head>");

    out.println("<body>");
    out.println("<p>"+ "以下の内容でお問い合わせしました。回答をお待ちください。" +"</p>");
    out.println("<p>" + name2 + "様" + "</p>");
    out.println("<p>"+ gender2 + "</p>");
    out.println("<p>"+ select2 + "</p>");
    out.println("<p>"+ textbox2 + "</p>");
    out.println("</body>");
    out.println("</html>");
    }
}