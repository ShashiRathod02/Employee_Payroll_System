import java.util.ArrayList;

class Payroll {
    private ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp.name);
    }

    boolean removeEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                employees.remove(emp);
                System.out.println("Employee removed: " + emp.name + " (ID: " + id + ")");
                return true;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
        return false;
    }

    Employee findEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null;
    }

    void displayEmployeeById(int id) {
        Employee emp = findEmployee(id);
        if (emp != null) {
            emp.displaySalaryInfo();
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    void displayAllRecords() {
        System.out.println("===== DISPLAYING ALL EMPLOYEE RECORDS =====");
        for (Employee emp : employees) {
            emp.displaySalaryInfo();
        }
    }

    void displaySummary() {
        System.out.println("===== PAYROLL SUMMARY =====");
        System.out.printf("%-5s %-15s %-15s %12s %12s %12s%n", "ID", "Name", "Department", "Basic(Rs)", "Gross(Rs)", "Net(Rs)");
        System.out.println("-------------------------------------------------------------------------------");
        for (Employee emp : employees) {
            System.out.printf(
                "%-5d %-15s %-15s %12.2f %12.2f %12.2f%n",
                emp.id,
                emp.name,
                emp.department,
                emp.calculateBasicSalary(),
                emp.calculateGrossSalary(),
                emp.calculateNetSalary()
            );
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
