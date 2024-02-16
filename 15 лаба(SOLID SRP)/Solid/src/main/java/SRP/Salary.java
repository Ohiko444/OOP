package SRP;

import java.util.Scanner;

public class Salary {

    Master master;

    public Salary(Master master) {
        this.master = master;
    }

    public int salary() {

        Scanner inp = new Scanner(System.in);
        int sum = 0;

        if (master.profession == Type.MANICURIST) {
            System.out.print("Введите колличество клиентов на услугу 'снятие маникюра': ");
            sum += RemovingTheManicure.removingTheManicure(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'наращивание ногтей': ");
            sum += NailExtensions.nailExtensions(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'создание маникюра': ");
            sum += CreatingAManicure.creatingAManicure(inp.nextInt());
        } else if (master.profession == Type.BROWMASTER) {
            System.out.print("Введите колличество клиентов на услугу 'выщипывание бровей': ");
            sum += PluckingBrows.pluckingBrows(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'покраска бровей': ");
            sum += EyebrowPainting.eyebrowPainting(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'ламинирование бровей': ");
            sum += LaminationBrows.laminationBrows(inp.nextInt());
        } else if (master.profession == Type.HAIRDRESSER) {
            System.out.print("Введите колличество клиентов на услугу 'наращивание волос': ");
            sum += HairExtensions.hairExtensions(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'покраска волос': ");
            sum += HairColoring.hairColoring(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'создание причёски': ");
            sum += CreatingHairstyle.creatingHairstyle(inp.nextInt());
            System.out.print("Введите колличество клиентов на услугу 'стрижка волос': ");
            sum += HairCutting.hairCutting(inp.nextInt());
        }
        return sum;
    }

}
