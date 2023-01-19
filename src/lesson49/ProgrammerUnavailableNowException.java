package lesson49;

public class ProgrammerUnavailableNowException extends Exception {
    private static String message = "The programmer is unavailable.";
    public ProgrammerUnavailableNowException() {
        super(message);
    }
}
