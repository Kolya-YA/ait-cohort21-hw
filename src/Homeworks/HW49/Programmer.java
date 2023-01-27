package Homeworks.HW49;

public class Programmer {
    static enum Status { AV, BSY, NA }
    private Status status;

    public Programmer(Status status) {
        this.status = status;
    }

    String doWork(String taskMsg) throws ProgrammerBusyException, ProgrammerUnavailableNowException {
        switch (this.status) {
            case AV:
                return taskMsg.toUpperCase();
            case BSY:
                throw new ProgrammerBusyException();
            case NA:
                throw new ProgrammerUnavailableNowException();
            default:
                return "Wrong Status";
        }
    }
}
