package Homeworks.HW49;

public class ProgrammerBusyException extends Exception {
    private static String message = "The programmer is busy with another task.";

    public ProgrammerBusyException() {
        super(message);
    }
}
