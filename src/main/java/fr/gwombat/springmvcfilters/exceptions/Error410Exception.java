package fr.gwombat.springmvcfilters.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@ResponseStatus(value = HttpStatus.GONE)
public class Error410Exception extends Exception {

    public Error410Exception(String cause) {
        super(cause);
    }
}
