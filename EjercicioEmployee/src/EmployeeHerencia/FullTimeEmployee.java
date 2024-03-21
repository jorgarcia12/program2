package EmployeeHerencia;

public class FullTimeEmployee extends Employee{

    private double yearlyBonus;

    public FullTimeEmployee(int id, String name, double salary, double yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + yearlyBonus;
    }
}
