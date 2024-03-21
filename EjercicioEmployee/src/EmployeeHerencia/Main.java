package EmployeeHerencia;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1,"Raul",1500,700);
        PartTimeEmployee pE1 = new PartTimeEmployee(2,"Jorge",2000,500,25);

        System.out.println("El empleado a tiempo medio gano "+pE1.calculateSalary()+" este año");
        System.out.println("El empleado a tiempo completo gano "+e1.calculateSalary()+" este año");
    }
}
