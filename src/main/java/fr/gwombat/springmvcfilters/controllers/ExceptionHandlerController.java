package fr.gwombat.springmvcfilters.controllers;

import fr.gwombat.springmvcfilters.exceptions.Error404Exception;
import fr.gwombat.springmvcfilters.exceptions.Error410Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({NoHandlerFoundException.class, Error404Exception.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle404() {
        return "Oups! A 404 error was thrown...";
    }

    @ExceptionHandler(Error410Exception.class)
    @ResponseStatus(HttpStatus.GONE)
    public String handle410(Error410Exception e) {
        return "Hum! it seems that this resource has gone: " + e.getMessage();
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleExceptions(Throwable throwable, HttpServletResponse response) {
        return "An error occured: " + throwable.getMessage() + "\nResponse code: " + response.getStatus();
    }

}
