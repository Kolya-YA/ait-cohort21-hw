package Homeworks.HW49;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Programmer avProgrammer = new Programmer(Programmer.Status.AV);
        Programmer bsyProgrammer = new Programmer(Programmer.Status.BSY);
        Programmer naProgrammer = new Programmer(Programmer.Status.NA);
        List<Programmer> goodTeam = List.of(bsyProgrammer, naProgrammer, avProgrammer);
        List<Programmer> badTeam = List.of(bsyProgrammer, naProgrammer, bsyProgrammer);
        TeamLead luckyTeamLead = new TeamLead(TeamLead.Status.AV, goodTeam);
        TeamLead unluckyTeamLead = new TeamLead(TeamLead.Status.AV, badTeam);
        TeamLead lazyTeamLead = new TeamLead(TeamLead.Status.NA, goodTeam);

        String simpleTask = "Come on, program it. Hurry up!!!";
        String projectTask = "Why don't we do an app? Let's make one!";

        try {
            System.out.println(avProgrammer.doWork(simpleTask));
        } catch (ProgrammerBusyException ex) {
            System.out.println(ex.getMessage());
        } catch (ProgrammerUnavailableNowException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(bsyProgrammer.doWork(simpleTask));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(naProgrammer.doWork(simpleTask));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("————===***===————");

        try {
            System.out.println(luckyTeamLead.doWork(projectTask));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(unluckyTeamLead.doWork(projectTask));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(lazyTeamLead.doWork(projectTask));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
