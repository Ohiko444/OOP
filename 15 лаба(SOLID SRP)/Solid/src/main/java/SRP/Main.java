package SRP;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Введите имя мастера: ");
        String name = inp.nextLine();

        System.out.print("Выберите профессию мастера: \n1 - Маникюрщица\n2 - Бровист\n3 - Парикмахер\nВыбор: ");
        int choice = inp.nextInt();

        Master master = new Master();
        switch (choice) {
            case 1:
                master = new Master(name, Type.MANICURIST);
                break;
            case 2:
                master = new Master(name, Type.BROWMASTER);
                break;
            case 3:
                master = new Master(name, Type.HAIRDRESSER);
                break;
        }

        Salary person = new Salary(master);
        int salary = person.salary();

        System.out.println("--------------ОТЧЁТ--------------");
        System.out.println("Имя мастера: " + master.getName() + "\nПрофессия мастера: " + master.getProfession() + "\nЗарплата = " + salary);
    }

}
