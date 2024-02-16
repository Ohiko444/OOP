package Firma3;

public class Write {

    Basic employee;

    public Write(Basic employee){
        this.employee = employee;
    }

    public void printReport(){
        employee.print();
        System.out.println("\nСписок выполняемых работ в организации: \n**" + employee.getPost());
        System.out.println("\nОбщая сумма зарплат всех работников = " + employee.getSalary());
    }
}
