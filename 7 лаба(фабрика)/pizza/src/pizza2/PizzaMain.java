package pizza2;

import java.util.Scanner;

public class PizzaMain {

    public static void check(PizzaStore pizzaStore){
        Scanner inp = new Scanner(System.in);
        System.out.print("Выберете пиццу: \n1 - сырная пицца\n2 - пицца из морепродуктов\n3 - пепперони\n4 - вегетарианская пицца\nВыбор: ");
        int choice = inp.nextInt();
        switch (choice){
            case 1 -> System.out.println(pizzaStore.orderPizza("cheese"));
            case 2 -> System.out.println(pizzaStore.orderPizza("clam"));
            case 3 -> System.out.println(pizzaStore.orderPizza("pepperoni"));
            case 4 -> System.out.println(pizzaStore.orderPizza("veggie"));
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        PizzaStore nyStore = new NYPizzaFactory();
        PizzaStore chicagoStore = new ChicagoPizzaFactory();
        PizzaStore californiaStore = new CaliforniaPizzaFactory();

        System.out.print("Выберите регион:\n1 - Нью-Йорк\n2 - Чикаго\n3 - Калифорния\nВыбор: ");
        int choice = inp.nextInt();
        switch (choice){
            case 1 -> check(nyStore);
            case 2 -> check(chicagoStore);
            case 3 -> check(californiaStore);
        }

        System.out.println("--------------------------------------------------");

        System.out.print("Выберите регион:\n1 - Нью-Йорк\n2 - Чикаго\n3 - Калифорния\nВыбор: ");
        choice = inp.nextInt();
        switch (choice){
            case 1 -> check(nyStore);
            case 2 -> check(chicagoStore);
            case 3 -> check(californiaStore);
        }
    }
}
