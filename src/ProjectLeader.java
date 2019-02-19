public class ProjectLeader extends Employee {
    TeamLead leaders[];

    public ProjectLeader() {

    }

    public ProjectLeader(TeamLead[] leaders, String name) {
        super(name);
        this.leaders = leaders;
    }

    @Override
    public void work() {
        System.out.println("Im a Project Leader & I'm doing my job");
    }

    public TeamLead[] getLeaders() {
        for (int i = 0; i < leaders.length; i++)
            System.out.println(leaders[i].name);
        return leaders;
    }

    public void setLeaders(TeamLead[] leaders) {
        this.leaders = leaders;
    }
}
