package web.servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/LoginVerify")

public class LoginVerify extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginVerify() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("password");
        if(uname.equals("admin") && pwd.equals("admin")){
            System.out.println("Identifiants corrects");
        } else {
            System.out.println("Erreur dans les identifiants");
        }
    }

}
