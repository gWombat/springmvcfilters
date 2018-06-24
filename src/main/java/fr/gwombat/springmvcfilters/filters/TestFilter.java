package fr.gwombat.springmvcfilters.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Hello from the filter!!");

        chain.doFilter(request, response);
    }
}
