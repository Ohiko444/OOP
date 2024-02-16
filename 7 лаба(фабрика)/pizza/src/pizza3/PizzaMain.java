package pizza3;

import java.util.Scanner;

public class PizzaMain {

    public static Pizza check(PizzaStore pizzaStore){
        Scanner inp = new Scanner(System.in);
        System.out.print("Выберете пиццу: \n1 - сырная пицца\n2 - пицца из морепродуктов\n3 - пепперони\n4 - вегетарианская пицца\nВыбор: ");
        int choice = inp.nextInt();
        return switch (choice) {
            case 1 -> pizzaStore.orderPizza("cheese");
            case 2 -> pizzaStore.orderPizza("clam");
            case 3 -> pizzaStore.orderPizza("pepperoni");
            case 4 -> pizzaStore.orderPizza("veggie");
            default -> null;
        };
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        System.out.print("Выберите регион:\n1 - Нью-Йорк\n2 - Чикаго\nВыбор: ");
        int choice = inp.nextInt();

        Pizza pizza = switch (choice) {
            case 1 -> check(nyStore);
            case 2 -> check(chicagoStore);
            default -> null;
        };
        System.out.println(pizza);

        System.out.print("Выберите регион:\n1 - Нью-Йорк\n2 - Чикаго\nВыбор: ");
        choice = inp.nextInt();

        pizza = switch (choice) {
            case 1 -> check(nyStore);
            case 2 -> check(chicagoStore);
            default -> null;
        };
        System.out.println(pizza);
    }
}
