import java.util.Scanner;

public class SrarbuzzCoffee {

    public static void dobav(Beverage beverage){
        Scanner inp = new Scanner(System.in);
        System.out.println("Выберете размер добаавки: \n1 - маленькая \n2 - средняя \n3 - большая");
        int k = inp.nextInt();
        switch (k) {
            case 1 -> beverage.setSize(Beverage.Size.TALL);
            case 2 -> beverage.setSize(Beverage.Size.GRANDE);
            case 3 -> beverage.setSize(Beverage.Size.VENTI);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Beverage beverage = new Espresso();

        System.out.print("Выберете напиток: \n1 - эспрессо \n2 - с тёмной обжаркой \n3 - без кофеина \n4 - на домашней смеси \nНапиток: ");
        int i = inp.nextInt();
        switch (i) {
            case 1 -> beverage = new Espresso();
            case 2 -> beverage = new DarkRoast();
            case 3 -> beverage = new Decaf();
            case 4 -> beverage = new HouseBlend();
        }
        System.out.println("Выберете добавку: \n1 - соя \n2 - молочная пенка \n3 - взбитые сливки \n4 - шоколад \n0 - выйти из добавок \nДобавка: ");
        int j = inp.nextInt();
        while (j != 0){
            switch (j) {
                case 1 -> {
                    dobav(beverage);
                    beverage = new Soy(beverage);
                }
                case 2 -> {
                    dobav(beverage);
                    beverage = new Milk(beverage);
                }
                case 3 -> {
                    dobav(beverage);
                    beverage = new Whip(beverage);
                }
                case 4 -> {
                    dobav(beverage);
                    beverage = new Mocha(beverage);
                }
            }
            System.out.println("Выберете добавку: \n1 - соя \n2 - молочная пенка \n3 - взбитые сливки \n4 - шоколад \n0 - выйти из добавок \nДобавка: ");
            j = inp.nextInt();
        }
        System.out.print("Ваш кофе: " + beverage.getDescription() + " $");
        System.out.printf("%.2f", beverage.cost());
    }
}
