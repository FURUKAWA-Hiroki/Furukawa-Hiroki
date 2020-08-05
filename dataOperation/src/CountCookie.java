//課題3

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cookie[] cookies;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset= UTF-8>");
			out.println("<title>想定画面　初めての訪問</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + "訪問回数テスト（クッキー）" + "</h1>");

			//クッキーを取得
			Cookie[] cookies = request.getCookies();
			Cookie countCookie = null;

			String welcomeMsg;

			if (cookies == null) {
				welcomeMsg = "初めての訪問です。";

				//Countという名前をつけたCookieを作成
				Cookie cookie = new Cookie("Count", "1");
				//有効期限を5分に設置
				cookie.setMaxAge(300);
				//cookieを保存
				//次回アクセス時よりこのCookieが使用可能
				response.addCookie(cookie);
				response.setContentType("text/html; charset = UTF-8");
				out.println("<h2>" + welcomeMsg + "</h2>");

			} else {
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("Count")) {
						countCookie = cookies[i];
					}
				}

				if (countCookie != null) {
					int visited = Integer.parseInt(countCookie.getValue()) + 1;
					welcomeMsg = visited + "回目の訪問です。";

					countCookie.setValue(Integer.toString(visited));
					response.addCookie(countCookie);
					countCookie.setMaxAge(300);
					response.setContentType("text/html; charset = UTF-8");
					out.println("<h2>" + welcomeMsg + "</h2>");
				}
			}
			out.println("<a href =/dataOperation/CountCookie >画面を再訪問 </a>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	public Cookie[] getCookies() {
		return cookies;
	}

	public void setCookies(Cookie[] cookies) {
		this.cookies = cookies;
	}
}