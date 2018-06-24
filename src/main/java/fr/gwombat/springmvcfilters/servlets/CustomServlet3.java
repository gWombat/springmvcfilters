package fr.gwombat.springmvcfilters.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by guillaume. Working on servlet 3.0 environments
 *
 * @since 24/06/2018
 */
@WebServlet(name = "customServlet3", urlPatterns = "/my-servlet-3", loadOnStartup = 3)
public class CustomServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Custom servlet 3.0 called! Forwarding to /hello endpoint");
        req.getRequestDispatcher("/hello").forward(req, resp);
    }
}
