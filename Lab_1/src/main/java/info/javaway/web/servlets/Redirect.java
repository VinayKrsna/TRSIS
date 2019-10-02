package info.javaway.web.servlets;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Redirect extends HttpServlet{
    private static int count = 0;
    private static int size = 0;
    private static Random rand = new Random();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        size = rand.nextInt(10);
        Date date = new Date();
        req.setAttribute("current_count", count);
        req.setAttribute("date", date.toString());
        req.setAttribute("size", size);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}