package IEmployee;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int CalculateSalary(){
        return paymentPerHour*8*30;
    }
    }

