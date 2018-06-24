package fr.gwombat.springmvcfilters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class Error404Exception extends Exception {
}
