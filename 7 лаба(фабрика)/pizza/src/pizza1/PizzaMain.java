package pizza1;

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
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        check(pizzaStore);

        System.out.println("---------------------------------------------------");

        check(pizzaStore);
    }
}
