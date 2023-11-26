package by.baranova.homeworksecond;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static by.baranova.homeworksecond.Const.*;
@WebServlet(ACCOUNT_PAGE)
public class AccountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect(request.getContextPath() + ACCOUNT_PAGE_HTML);
    }
}
