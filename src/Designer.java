public class Designer extends Employee {
    public Designer() {
    }

    public Designer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Im a Designer & I'm doing my job");
    }
}
