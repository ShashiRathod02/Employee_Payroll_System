public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        payroll.addEmployee(new Employee(101, "Shashikumar", "Computer Science", 200, 160, 5000, 2000));
        payroll.addEmployee(new Employee(102, "Ravi Kumar", "Electronics", 180, 160, 4000, 1500));
        payroll.addEmployee(new Employee(103, "Priya Singh", "Mechanical", 220, 170, 4500, 2500));
        payroll.addEmployee(new Employee(104, "Anjali Rao", "Civil", 190, 155, 4200, 2100));

        System.out.println();
        payroll.displayAllRecords();
        payroll.displaySummary();

        System.out.println();
        int searchId = 102;
        System.out.println("Searching for employee with ID " + searchId + ":");
        payroll.displayEmployeeById(searchId);

        System.out.println();
        int removeId = 103;
        System.out.println("Removing employee with ID " + removeId + ":");
        payroll.removeEmployee(removeId);

        System.out.println();
        payroll.displaySummary();
    }
}
