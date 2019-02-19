public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Marius");
        Tester tester = new Tester();
        Designer designer = new Designer();

        Employee peons[] = new Employee[1];
        peons[0] = programmer1;
        peons[1] = tester;
        peons[2] = designer;
        TeamLead teamLead1 = new TeamLead(peons, "Flavius");
        TeamLead teamLeadList[] = new TeamLead[1];
        teamLeadList[0] = teamLead1;

        ProjectLeader projectLeadersList[] = new ProjectLeader[1];
        ProjectLeader projectLeader1 = new ProjectLeader(teamLeadList, "Ion");
        ProjectLeader projectLeader2 = new ProjectLeader();
        projectLeadersList[0] = projectLeader1;
        projectLeadersList[1] = projectLeader2;

        Manager manager = new Manager(projectLeadersList, "Dan");

        manager.work();
        manager.getLeaders();
    }
}
