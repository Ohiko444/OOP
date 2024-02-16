package OCP;

import java.util.Scanner;

public class Main {

    //программные сущности (классы, модули, функции и т.п.) должны быть открыты для расширения, но закрыты для изменения.

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Введите имя мастера: ");
        String name = inp.nextLine();

        System.out.print("Выберите профессию мастера: \n1 - Маникюрщица\n2 - Бровист\n3 - Парикмахер\nВыбор: ");
        int choice = inp.nextInt();

        Master master = new Master(name);
        Salary person = new Salary();
        switch (choice) {
            case 1:
                person.salary((Manicurist)master);
                break;
            case 2:
                person.salary((BrowMaster) master);
                break;
            case 3:
                person.salary((Hairdresser) master);
                break;
        }


        System.out.println("--------------ОТЧЁТ--------------");
        System.out.println("Имя мастера: " + master.getName() + "\nПрофессия мастера: " + master.getProfession() + "\nЗарплата = " );
    }

}
