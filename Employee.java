class Employee {
    int id;
    String name;
    double hourlyRate;
    int hoursWorked;
    double allowance;
    double deduction;

    Employee(int id, String name, double hourlyRate, int hoursWorked, double allowance, double deduction) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.allowance = allowance;
        this.deduction = deduction;
    }
}