public class Employee implements Human {
    private int id;
    public String name;

    public Employee() {
    }


    public Employee(String name) {
        this.id = (int) (Math.random() * 1024 + 1);
        this.name = name;
    }

    public void work() {
    }
}
