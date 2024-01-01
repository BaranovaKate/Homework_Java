package by.baranova.homework4;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

@WebServlet("/user")
public class mainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String middleName = request.getParameter("middleName");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String city = request.getParameter("city");
        String phoneNumber = request.getParameter("phoneNumber");

        if (!validateUserData(username, password, firstName, lastName, dob, phoneNumber)) {
            request.setAttribute("errorMessage", "Проверьте правильность введённых данных");

            request.setAttribute("username", username);
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("middleName", middleName);
            request.setAttribute("gender", gender);
            request.setAttribute("dob", dob);
            request.setAttribute("city", city);
            request.setAttribute("phoneNumber", phoneNumber);

            request.getRequestDispatcher("/createUser.jsp").forward(request, response);
        } else
        {
            request.setAttribute("username", username);
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("middleName", middleName);
            request.setAttribute("gender", gender);
            request.setAttribute("dob", dob);
            request.setAttribute("city", city);
            request.setAttribute("phoneNumber", phoneNumber);
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }
    }
private boolean validateUserData(String username, String password, String firstName, String lastName, String dob, String phoneNumber) {
    LocalDate dobDate;
    try {
        dobDate = LocalDate.parse(dob);
    } catch (DateTimeParseException e) {
        return false;
    }
    LocalDate currentDate = LocalDate.now();
    int age = Period.between(dobDate, currentDate).getYears();

    if (age < 18) {
        return false;
    }
    String phoneNumberDigitsOnly = phoneNumber.replaceAll("\\D", "");
    if (phoneNumberDigitsOnly.length() != 12 ) {
        return false;
    }
    return true;
}
}