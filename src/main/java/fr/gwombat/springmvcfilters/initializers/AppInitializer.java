package fr.gwombat.springmvcfilters.initializers;

import fr.gwombat.springmvcfilters.config.WebConfig;
import fr.gwombat.springmvcfilters.filters.TestFilter;
import fr.gwombat.springmvcfilters.servlets.CustomServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 * <p>
 * https://www.vojtechruzicka.com/spring-get-rid-of-web-xml/
 */
public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        final AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(WebConfig.class);

        final DispatcherServlet dispatcherServlet1 = new DispatcherServlet(dispatcherContext);
        dispatcherServlet1.setThrowExceptionIfNoHandlerFound(true);

        ServletRegistration.Dynamic dispatcherServlet = container.addServlet("dispatcherServlet", dispatcherServlet1);
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");

        //test filter
        FilterRegistration.Dynamic myFilter = container.addFilter("testFilter", TestFilter.class);
        myFilter.addMappingForUrlPatterns(null, true, "/*");

        //custom servlet
        ServletRegistration.Dynamic customServlet = container.addServlet("customServlet", CustomServlet.class);
        customServlet.addMapping("/my-servlet");
        customServlet.setLoadOnStartup(2);
    }
}
