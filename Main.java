public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ravi", 200, 40, 1000, 500);
        Employee e2 = new Employee(2, "Sita", 250, 35, 1200, 600);

        Payroll p = new Payroll();

        p.display(e1);
        p.display(e2);
    }
}