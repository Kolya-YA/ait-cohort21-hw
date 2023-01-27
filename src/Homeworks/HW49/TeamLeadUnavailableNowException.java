package Homeworks.HW49;

public class TeamLeadUnavailableNowException extends Exception {
    private static String message = "Why is TeamLead out there?";
    public TeamLeadUnavailableNowException() {
        super(message);
    }
}
