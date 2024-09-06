import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get email and password from the HTML form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Set response content type    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Basic validation (replace with proper logic like checking a database in real applications)
        if ("dharani@gmail.com".equals(email) && "123456".equals(password)) {
            out.println("<html>");
            out.println("<head><title>Login Successful</title>");
            out.println("<style>");
            out.println("body { background-color: #f0f0f0; font-family: Arial, sans-serif; }");
            out.println(".container { margin-top: 100px; text-align: center; color: green; }");
            out.println("</style></head>");
            out.println("<body>");
            out.println("<div class='container'><h1>Welcome, " + email + "!</h1>");
            out.println("<p>Login successful!</p></div>");
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("<html>");
            out.println("<head><title>Login Failed</title>");
            out.println("<style>");
            out.println("body { background-color: #f0f0f0; font-family: Arial, sans-serif; }");
            out.println(".container { margin-top: 100px; text-align: center; color: red; }");
            out.println("</style></head>");
            out.println("<body>");
            out.println("<div class='container'><h1>Login Failed</h1>");
            out.println("<p>Invalid email or password.</p>");
            out.println("<a href='index.html'>Try Again</a></div>");
            out.println("</body>");
            out.println("</html>");
        }

        out.close();
    }
}
