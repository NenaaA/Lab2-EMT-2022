package mk.ukim.finki.lab2emt.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AuthorsNotFoundException extends RuntimeException{
    public AuthorsNotFoundException() {
        super("One or more authors not found");
    }
}
