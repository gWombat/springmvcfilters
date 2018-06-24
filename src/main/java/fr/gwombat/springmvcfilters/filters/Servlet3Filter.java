package fr.gwombat.springmvcfilters.filters;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@WebFilter(urlPatterns = "/*")
public class Servlet3Filter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Servlet 3.0 filter called!");
        chain.doFilter(request, response);
    }
}
