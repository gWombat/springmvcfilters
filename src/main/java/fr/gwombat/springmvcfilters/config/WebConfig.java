package fr.gwombat.springmvcfilters.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@EnableWebMvc
@ComponentScan({
        "fr.gwombat.springmvcfilters.controllers",
        "fr.gwombat.springmvcfilters.filters",
        "fr.gwombat.springmvcfilters.servlets"})
public class WebConfig implements WebMvcConfigurer {


}
