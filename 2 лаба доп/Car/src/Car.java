import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Cardealership car = new Lada();

        System.out.print("Выберите машину: \n1 - Lada Xray\n2 - Audi A6 allroad\n3 - Citroen C5\nМашина: ");
        int nomcar = inp.nextInt();
        switch (nomcar) {
            case 1 -> car = new Lada();
            case 2 -> car = new Audi();
            case 3 -> car = new Citroen();
        }
        System.out.println("Выберите комплектацию:\n1 - минимальная\n2 - средняя\n3 - максимальная\nКомплектация: ");
        int komplect = inp.nextInt();
        switch (komplect) {
            case 1 -> car = new Base(car);
            case 2 -> car = new Average(car);
            case 3 -> car = new Max(car);
        }
        System.out.println("Выберите дополнительную услугу:\n1 - покраска\n2 - страховка\n3 - ремонт\n4 - техосмотр\n0 - выход\nДополнительная услуга: ");
        int usl = inp.nextInt();
        while(usl != 0){
            switch (usl) {
                case 1 -> car = new Painting(car);
                case 2 -> car = new Insurance(car);
                case 3 -> car = new Repair(car);
                case 4 -> car = new Inspection(car);
            }
            System.out.println("Выберите дополнительную услугу:\n1 - покраска\n2 - страховка\n3 - ремонт\n4 - техосмотр\n0 - выход\nДополнительная услуга: ");
            usl = inp.nextInt();
        }
        System.out.println(car.getDescription() + "\nВы должны заплатить: " + car.cost() + " рублей");
    }
}
