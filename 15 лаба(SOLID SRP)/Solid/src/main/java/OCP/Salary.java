package OCP;

import java.util.Scanner;

public  class Salary {

    public void process(Master master){

        int salary = 0;
        if (master instanceof Manicurist){
            salary = salary((Manicurist) master);
        } else if (master instanceof  BrowMaster){
            salary = salary((BrowMaster) master);
        } else if (master instanceof Hairdresser){
            salary = salary((Hairdresser) master);
        }

        System.out.println("Имя мастера: " + master.getName() + "\nПрофессия мастера: " + master.getProfession() + "\nЗарплата = " + salary);

    }

    public int salary(Manicurist master) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        System.out.print("Введите колличество клиентов на услугу 'снятие маникюра': ");
        sum += (master.removingTheManicure(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'наращивание ногтей': ");
        sum += (master.nailExtensions(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'создание маникюра': ");
        sum += (master.creatingAManicure(inp.nextInt()));

        return sum;
    }

    public int salary(BrowMaster master) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        System.out.print("Введите колличество клиентов на услугу 'выщипывание бровей': ");
        sum += (master.pluckingBrows(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'покраска бровей': ");
        sum += (master.eyebrowPainting(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'ламинирование бровей': ");
        sum += (master.laminationBrows(inp.nextInt()));

        return sum;
    }

    public int salary(Hairdresser master) {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        System.out.print("Введите колличество клиентов на услугу 'наращивание волос': ");
        sum += (master.hairExtensions(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'покраска волос': ");
        sum += (master.hairColoring(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'создание причёски': ");
        sum += (master.creatingHairstyle(inp.nextInt()));
        System.out.print("Введите колличество клиентов на услугу 'стрижка волос': ");
        sum += (master.hairCutting(inp.nextInt()));

        return sum;
    }

}
