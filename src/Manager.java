public class Manager extends Employee {
    private ProjectLeader leaders[];

    public Manager() {

    }

    public Manager(ProjectLeader[] leaders, String name) {
        super(name);
        this.leaders = leaders;
    }

    @Override
    public void work() {
        System.out.println("Im a Manger & I'm doing my job");
    }

    public ProjectLeader[] getLeaders() {
        for (int i = 0; i < leaders.length; i++)
            System.out.println(leaders[i].name);
        return leaders;
    }

    public void setLeaders(ProjectLeader[] leaders) {
        this.leaders = leaders;
    }
}
