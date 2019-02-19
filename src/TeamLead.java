public class TeamLead extends Employee {
    private Employee employees[];

    public TeamLead() {

    }

    public TeamLead(Employee[] employees, String name) {
        super(name);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("Im a Team Leader & I'm doing my job");
    }

    public Employee[] getPeons() {
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].name);
        return employees;
    }

    public void setPeons(Employee[] employees) {
        this.employees = employees;
    }
}
