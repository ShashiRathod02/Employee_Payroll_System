class Payroll {
    double calculateSalary(Employee emp) {
        double basic = emp.hourlyRate * emp.hoursWorked;
        return basic + emp.allowance - emp.deduction;
    }

    void display(Employee emp) {
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Net Salary: " + calculateSalary(emp));
        System.out.println("--------------------");
    }
}