package lesson49;

public class AllProgramersAreBusyNowException extends Exception {
    private static String message = "Damn, we need more programmers!";
    public AllProgramersAreBusyNowException() {
        super(message);
    }
}
