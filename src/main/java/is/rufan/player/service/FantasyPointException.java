package is.rufan.player.service;

/**
 * Created by eysteinn on 25/10/15.
 */
public class FantasyPointException extends RuntimeException {
    public FantasyPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public FantasyPointException() {

    }

    public FantasyPointException(String message) {
        super(message);
    }
}
