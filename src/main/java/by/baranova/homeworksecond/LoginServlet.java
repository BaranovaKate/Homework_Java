package by.baranova.homeworksecond;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import static by.baranova.homeworksecond.Const.*;

@WebServlet(LOGIN_PAGE)
public class LoginServlet extends HttpServlet {
    private static final Map<String, String> userCredentials = new HashMap<>();
    static {
        userCredentials.put("Katerina", "1234567");
        userCredentials.put("Teacher", "4569871");
        userCredentials.put("Olga", "2346546");
        userCredentials.put("Anton", "9876543");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + ACCOUNT_PAGE);
        } else {
            response.sendRedirect(request.getContextPath() + LOGIN_PAGE_HTML);
        }
    }
}