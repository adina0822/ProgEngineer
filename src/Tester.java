public class Tester extends Employee {

    public Tester() {
    }

    public Tester(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Im a Tester & I'm doing my job");
    }
}
