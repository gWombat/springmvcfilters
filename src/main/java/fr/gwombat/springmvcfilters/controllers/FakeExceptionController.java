package fr.gwombat.springmvcfilters.controllers;

import fr.gwombat.springmvcfilters.exceptions.Error404Exception;
import fr.gwombat.springmvcfilters.exceptions.Error410Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@RestController
@RequestMapping("/error")
public class FakeExceptionController {

    @GetMapping
    public void throwException(@RequestParam(name = "code", required = false) int code) throws Exception {
        switch (code) {
            case 410:
                throw new Error410Exception("The resource you requested has gone...");
            case 404:
                throw new Error404Exception();
            default:
                throw new Exception();
        }
    }

    @GetMapping("/status")
    //@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "Error!!!!!!")
    public ResponseEntity throwOtherException() throws Exception {
        //throw new Exception("Mouahahahahahaha!!!");
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Error 502");
    }

}
