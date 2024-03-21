package EmployeeHerencia;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int workedHours;

    public PartTimeEmployee(int id, String name, double salary, double hourlyRate, int workedHours) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() +(workedHours*hourlyRate);
    }
}
