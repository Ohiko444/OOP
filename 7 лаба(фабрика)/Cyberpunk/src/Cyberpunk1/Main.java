package Cyberpunk1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        BuildingACharacter buildingACharacter = new BuildingACharacter(new ChoiceFactory());

        int choice = 1;

        while (choice != 0) {
            System.out.print("Выберете персонажа: \n1 - Адам Смешер\n2 - Альт Каннингем\n3 - Мелиса Рорри\n4 - Панам Палмер\n0 - выход\nВыбор: ");
            choice = inp.nextInt();
            switch (choice) {
                case 1 -> System.out.println(buildingACharacter.orderPerson("Adam"));
                case 2 -> System.out.println(buildingACharacter.orderPerson("Alt"));
                case 3 -> System.out.println(buildingACharacter.orderPerson("Melissa"));
                case 4 -> System.out.println(buildingACharacter.orderPerson("Panam"));
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
