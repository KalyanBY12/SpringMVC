package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet
{
    private  PlayerService service = new PlayerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String playerName = request.getParameter("playerName");
        System.out.println(playerName);
        request.setAttribute("jspPlayerName", playerName);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>" + "<title>Player</title>" + "</head>");
//        writer.println("<body>" + "<h1> Welcome to Player Application</h1>" + "</body");
//        writer.println("</html");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, IOException {
        String playerName = request.getParameter("welcomePlayerName");
        System.out.println(playerName);
        Player player = service.getPlayerByName(playerName);

        request.setAttribute("name",playerName);
        request.setAttribute("id", player.getId());
        request.setAttribute("nationality", player.getNationality());
        request.setAttribute("age", player.getAge());



        request.setAttribute("playerName", playerName);request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);


    }
}