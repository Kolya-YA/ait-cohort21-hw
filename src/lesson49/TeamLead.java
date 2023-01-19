package lesson49;

import java.util.List;

public class TeamLead {
    static enum Status { AV, NA }
    private Status status;
    private List<Programmer> team;

    public TeamLead(Status status, List<Programmer> team) {
        this.status = status;
        this.team = team;
    }

    String doWork(String taskMsg) throws TeamLeadUnavailableNowException, AllProgramersAreBusyNowException {
        switch (status) {
            case AV:
                return pickProgrammer(taskMsg);
            case NA:
                throw new TeamLeadUnavailableNowException();
            default:
                return "Wrong Status";
        }
    }

    private String pickProgrammer(String taskMsg) throws AllProgramersAreBusyNowException {
        for (Programmer programmer : team) {
            try {
                return programmer.doWork(taskMsg);
            } catch (Exception ex) {}
        }
        throw new AllProgramersAreBusyNowException();
    }
}
