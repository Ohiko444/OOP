package Firma3;

import Firma3.Vasya.DeveloperJohn;
import Firma3.Vasya.AdministratorKate;
import Firma3.Vasya.Elizabet.*;
import Firma3.Vasya.ElizabetTester;
import Firma3.Vasya.John.Petya.*;
import Firma3.Vasya.John.*;
import Firma3.Vasya.John.Zhenya.*;
import Firma3.Vasya.Kate.Antonina.AssistantMila;
import Firma3.Vasya.Kate.*;


public class Report {
    public static void main(String[] args) {

        Basic one = new MaintainingReport("1 ЗВЕНО➭ ➭ ➭ ➭ ➭ ➭ ➭ ➭ \n");
        one.add(new DirectorVasya());


        Basic two = new MaintainingReport("2 ЗВЕНО➭ ➭ ➭ \n");
        Basic vas = new MaintainingReport("подчиняется Васе ");
        vas.add(new DeveloperJohn());
        vas.add(new ElizabetTester());
        vas.add(new AdministratorKate());
        two.add(vas);


        Basic three = new MaintainingReport("3 ЗВЕНО➭ ➭ ➭ ➭ ➭ ➭ ➭ ➭ \n");
        Basic john = new MaintainingReport("подчиняется Джону ");
        Basic pet = new TeamlidPetya();
        john.add(pet);
        john.add(new TeamlidZhenya());

        Basic eliz = new MaintainingReport("подчиняется Элизабет ");
        eliz.add(new TesterA());
        eliz.add(new TesterB());
        eliz.add(new TesterC());
        eliz.add(new TesterD());
        eliz.add(new TesterE());

        Basic kate = new MaintainingReport("подчиняется Кейт ");
        kate.add(new HRNatalya());
        Basic an = new AccountantAntonina();
        kate.add(an);
        kate.add(new LawyerOsip());

        three.add(john);
        three.add(eliz);
        three.add(kate);


        Basic four = new MaintainingReport("4 ЗВЕНО➭ ➭ ➭ \n");
        Basic petya = new MaintainingReport("подчиняется Пете ");
        Basic leh = new BackendLesha();
        petya.add(leh);
        Basic mar = new BackendMarat();
        petya.add(mar);
        Basic zhenya = new MaintainingReport("подчиняется Жене ");
        zhenya.add(new FrontendDasha());
        zhenya.add(new FrontendKolya());
        Basic son = new FrontendSonya();
        zhenya.add(son);
        Basic tol = new FrontendTolya();
        zhenya.add(tol);
        Basic antonina = new MaintainingReport("подчиняется Антонине ");
        antonina.add(new AssistantMila());

        four.add(petya);
        four.add(zhenya);
        four.add(antonina);


        Basic five = new MaintainingReport("5 ЗВЕНО➭ ➭ ➭ ➭ ➭ ➭ ➭ ➭ ");

        Basic all = new MaintainingReport("");

        all.add(one);
        all.add(two);
        all.add(three);
        all.add(four);

        Write write = new Write(all);

        System.out.println();
        write.printReport();


        Basic osip = new MaintainingReport("подчиняется Осипу ");
        osip.add(new BasicEmployee("Веня", 20000, "Помощник юриста"));
        osip.add(new BasicEmployee("Беня", 20000, "Помощник юриста"));

        Basic lesh = new MaintainingReport("подчиняется Лёше ");
        Basic x = new BasicEmployee("X", 50000, "Стажёр бэкенд разработки");
        Basic y = new BasicEmployee("Y", 50000, "Стажёр бэкенд разработки");
        Basic z = new BasicEmployee("Z", 50000, "Стажёр бэкенд разработки");
        lesh.add(x);
        lesh.add(y);
        lesh.add(z);

        kate.remove(an);
        four.remove(antonina);

        john.remove(pet);
        john.add(leh);
        lesh.add(mar);
        zhenya.remove(son);
        zhenya.remove(tol);
        john.add(son);
        Basic sonya = new MaintainingReport("подчиняется Соне ");
        sonya.add(tol);
        sonya.add(new BasicEmployee("Робин", 20000, "Стражёр Сони"));

        four.remove(petya);
        four.add(lesh);
        four.add(sonya);

        System.out.println();
        write.printReport();


    }
}
