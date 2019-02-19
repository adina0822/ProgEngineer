public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name) {
        super(name);
    }

    @Override

    public void work() {
        System.out.println("Im a Programmer & I'm doing my job");
    }
}
