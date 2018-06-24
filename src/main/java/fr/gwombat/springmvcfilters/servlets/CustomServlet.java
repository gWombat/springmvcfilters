package fr.gwombat.springmvcfilters.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by guillaume.
 *
 * @since 24/06/2018
 */
public class CustomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Custom servlet called! Forwarding to /hello endpoint");
        req.getRequestDispatcher("/hello").forward(req, resp);
    }
}
