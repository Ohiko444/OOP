package Cyberpunk2;

import Cyberpunk2.Cyberpsihs.*;
import Cyberpunk2.Karporats.*;
import Cyberpunk2.Netrunners.*;
import Cyberpunk2.Nomads.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        BuildingACharacter creatingCyberpsih = new CyberpsihFactory();
        BuildingACharacter creatingKarporat = new KarporatFactory();
        BuildingACharacter creatingNetrunners = new NetrunnerFactory();
        BuildingACharacter creatingNomads = new NomadFactory();

        int choice = 1;
        while (choice != 0){
            System.out.print("Выберети о ком вы хотите узнать информацию:\n1 - киберпсихи\n2 - карпораты\n3 - нетраннеры\n4 - кочевники\n0 - выход\nВыбор: ");
            choice = inp.nextInt();
            System.out.println("--------------------------------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Выберите имя:\n1 - Мелисса Рори\n2 - Норио Акухара\n3 - Сабуро Арасака\nВыбор: ");
                    int choice1 = inp.nextInt();
                    System.out.println("--------------------------------------------------------------------------");
                    switch (choice1){
                        case 1 -> creatingCyberpsih.orderPerson("Melissa");
                        case 2 -> creatingCyberpsih.orderPerson("Norio");
                    }
                    break;
                case 2:
                    System.out.print("Выберите имя:\n1 - Адам Смешер\n2 - \nВыбор: ");
                    choice1 = inp.nextInt();
                    System.out.println("--------------------------------------------------------------------------");
                    switch (choice1){
                        case 1 -> creatingKarporat.orderPerson("Adam");
                        case 2 -> creatingKarporat.orderPerson("Saburo");
                    }
                    break;
                case 3: creatingNetrunners.orderPerson("Alt");
                case 4: creatingNomads.orderPerson("Panam");
            }
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
