package NoSRP;

import java.util.Scanner;

public class Salary {

    Master master;

    public Salary(Master master) {
        this.master = master;
    }

    public int salary() {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        if (master instanceof Manicurist) {
            System.out.print("Введите колличество клиентов на услугу 'снятие маникюра': ");
            sum += ((Manicurist) master).removingTheManicure(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'наращивание ногтей': ");
            sum += ((Manicurist) master).nailExtensions(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'создание маникюра': ");
            sum += ((Manicurist) master).creatingAManicure(inp.nextInt());
        } else if (master instanceof BrowMaster) {
            System.out.print("Введите колличество клиентов на услугу 'выщипывание бровей': ");
            sum += ((BrowMaster) master).pluckingBrows(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'покраска бровей': ");
            sum += ((BrowMaster) master).eyebrowPainting(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'ламинирование бровей': ");
            sum += ((BrowMaster) master).laminationBrows(inp.nextInt());
        } else if (master instanceof Hairdresser) {
            System.out.print("Введите колличество клиентов на услугу 'наращивание волос': ");
            sum += ((Hairdresser) master).hairExtensions(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'покраска волос': ");
            sum += ((Hairdresser) master).hairColoring(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'создание причёски': ");
            sum += ((Hairdresser) master).creatingHairstyle(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'стрижка волос': ");
            sum += ((Hairdresser) master).hairCutting(inp.nextInt());
        }
        return sum;
    }

}
