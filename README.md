# 🧾 Employee Payroll System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)

**Student:** SHASHIKUMAR  
**ID:** 4AL24CS408  
**College:** Alvas College of Engineering  

---

## 📋 Description

A Java-based Employee Payroll System that:
- Calculates employee salaries based on **working hours, allowances, and deductions**
- Stores payroll records using `ArrayList`
- Displays detailed salary information
- Supports **add, remove, and search** operations on employees

---

## ✨ Features

- ✅ Calculate **Basic Salary** (Hours Worked × Hourly Rate)
- ✅ Calculate **Gross Salary** (Basic + Allowances)
- ✅ Calculate **Net Salary** (Gross − Deductions)
- ✅ Add / Remove / Find employees
- ✅ Display individual salary details
- ✅ Display payroll summary table

---

## 📁 Project Structure

```
EmployeePayrollSystem/
├── src/
│   └── payroll/
│       ├── Employee.java        # Employee class with salary methods
│       ├── PayrollRecord.java   # Stores and manages employee records
│       └── Main.java            # Entry point / demo
└── README.md
```

---

## ▶️ How to Run

### Using Terminal / Command Prompt

```bash
# Step 1: Navigate to src directory
cd EmployeePayrollSystem/src

# Step 2: Compile all Java files
javac payroll/*.java

# Step 3: Run the program
java payroll.Main
```

### Using VS Code
1. Install **Extension Pack for Java** from Extensions (`Ctrl+Shift+X`)
2. Open the `EmployeePayrollSystem` folder → **File → Open Folder**
3. Open `src/payroll/Main.java`
4. Click the ▶️ **Run Java** button above the `main` method

### Using IntelliJ IDEA
1. Open IntelliJ → **Open** → select `EmployeePayrollSystem` folder
2. Right-click `Main.java` → **Run 'Main'**

---

## 🏗️ Classes & Methods

### `Employee`
| Method | Description |
|---|---|
| `Employee(id, name, dept, hours, rate, allowances, deductions)` | Constructor |
| `calculateBasicSalary()` | Returns hoursWorked × hourlyRate |
| `calculateGrossSalary()` | Returns basicSalary + allowances |
| `calculateNetSalary()` | Returns grossSalary − deductions |
| `displaySalaryInfo()` | Prints full salary breakdown |

### `PayrollRecord`
| Method | Description |
|---|---|
| `addEmployee(Employee)` | Adds employee to records |
| `removeEmployee(int id)` | Removes employee by ID |
| `findEmployee(int id)` | Finds and returns employee by ID |
| `displayAllRecords()` | Displays all employee details |
| `displaySummary()` | Prints formatted summary table |

---

## 📊 Sample Output

```
===== Adding Employees =====
Employee added: Shashikumar
Employee added: Ravi Kumar
Employee added: Priya Singh
Employee added: Anjali Rao

====================================
Employee ID   : 101
Name          : Shashikumar
Department    : Computer Science
Hours Worked  : 160.0
Hourly Rate   : Rs. 200.0
Basic Salary  : Rs. 32000.0
Allowances    : Rs. 5000.0
Gross Salary  : Rs. 37000.0
Deductions    : Rs. 2000.0
Net Salary    : Rs. 35000.0
====================================

===== PAYROLL SUMMARY =====
ID    Name            Department      Basic(Rs)    Gross(Rs)    Net(Rs)
---------------------------------------------------------------------------
101   Shashikumar     Computer Science 32000.00    37000.00     35000.00
102   Ravi Kumar      Electronics      27000.00    31000.00     29500.00
103   Priya Singh     Mechanical       37400.00    43400.00     40900.00
104   Anjali Rao      Civil            25375.00    28875.00     27675.00
---------------------------------------------------------------------------
```

---

## 🔧 Requirements

- Java JDK 8 or above
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or Terminal

---

## 📜 License

This project is submitted as part of academic coursework at **Alvas College of Engineering**.
