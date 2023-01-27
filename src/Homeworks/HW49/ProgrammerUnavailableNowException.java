package Homeworks.HW49;

public class ProgrammerUnavailableNowException extends Exception {
    private static String message = "The programmer is unavailable.";
    public ProgrammerUnavailableNowException() {
        super(message);
    }
}
