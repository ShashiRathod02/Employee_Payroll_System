class Employee {
    int id;
    String name;
    String department;
    double hourlyRate;
    double hoursWorked;
    double allowances;
    double deductions;

    Employee(int id, String name, String department, double hourlyRate, double hoursWorked, double allowances, double deductions) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    double calculateBasicSalary() {
        return hourlyRate * hoursWorked;
    }

    double calculateGrossSalary() {
        return calculateBasicSalary() + allowances;
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - deductions;
    }

    void displaySalaryInfo() {
        System.out.println("====================================");
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : Rs. " + String.format("%.2f", hourlyRate));
        System.out.println("Basic Salary  : Rs. " + String.format("%.2f", calculateBasicSalary()));
        System.out.println("Allowances    : Rs. " + String.format("%.2f", allowances));
        System.out.println("Gross Salary  : Rs. " + String.format("%.2f", calculateGrossSalary()));
        System.out.println("Deductions    : Rs. " + String.format("%.2f", deductions));
        System.out.println("Net Salary    : Rs. " + String.format("%.2f", calculateNetSalary()));
        System.out.println("====================================");
    }
}
