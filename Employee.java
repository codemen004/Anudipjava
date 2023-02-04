class Employee {
    long employeeid;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeid = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    public void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary *
                hra / 100);
        System.out.println("Total Salary: " + salary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = basicSalary * 10 / 100;
        System.out.println("Travel Allowance :" + transportAllowance);
    }

}

class Manager extends Employee {
    Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);

        System.out.println("----Manager Details----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + phone);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = basicSalary * 15 / 100;
        System.out.println("Travel Allowance :" + transportAllowance);
    }

}

class Trainee extends Employee {
    Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);

        System.out.println();
        System.out.println("----Employee Details----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + phone);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class InheritanceAcitivity {
    public static void main(String[] args) {
        Manager m = new Manager(126534, "john", "Mumbai India", 98899, 74000);
        m.calculateSalary();
        m.calculateTransportAllowance();

        Trainee t = new Trainee(364758, "Andrew", "Bangalore India", 78992, 50000.00);
        t.calculateSalary();
        t.calculateTransportAllowance();
    }
}