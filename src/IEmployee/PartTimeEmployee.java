package IEmployee;

public class PartTimeEmployee extends Employee {
    int WorkingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int WorkingHours) {
        super(name, paymentPerHour);
        this.WorkingHours = WorkingHours;
    }

    public int CalculateSalary() {
        return WorkingHours * getPaymentPerHour();
    }
}
