package servlet;

import bean.UserAccount;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        if (UserDao.select() == null) {
            throw new IllegalStateException("Error connecting to database");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (!login.isEmpty() && !password.isEmpty()) {
            ArrayList<UserAccount> userAccounts = UserDao.select();

            if (UserDao.findByName(userAccounts, login, password)) {
                HttpSession session = req.getSession();
                session.setAttribute("login", login);
                resp.addCookie(new Cookie("password", password));
                resp.sendRedirect(req.getContextPath() + "/hello");
            } else {
                throw new IllegalStateException("Wrong login or password");
            }
        } else {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

    }
}