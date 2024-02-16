package FirmaNew;

public class Main {
    public static void main(String[] args) {

        Component vasya = new Composite("", "Вася", 400_000, "Генеральный директор");
        Component john = new Composite("   ", "Джон", 250_000, "Разработчик");
        Component elizabet = new Composite("   ", "Элизабет", 110_000, "Главный тестировщик");
        Component kate = new Composite("   ", "Кейт", 60_000, "Администратор");
        Component petya = new Composite("      ", "Петя", 180_000, "Тимлид");
        Component zhenya = new Composite("      ", "Женя", 180_000, "Тимлид");
        Component lesha = new Employee("         ", "Лёша", 100_000, "Бэкенд разработчик");
        Component marat = new Employee("         ", "Марат", 100_000, "Бэкенд разработчик");
        Component dasha = new Employee("         ", "Даша", 90_000, "Фронтенд разработчик");
        Component kolya = new Employee("         ", "Коля", 90_000, "Фронтенд разработчик");
        Component sonya = new Employee("         ", "Соня", 90_000, "Фронтенд разработчик");
        Component tolya = new Employee("         ", "Толя", 90_000, "Фронтенд разработчик");
        Component a = new Employee("         ", "'Засекреченый' А", 80_000, "Тестировщик");
        Component b = new Employee("         ", "'Засекреченый' B", 80_000, "Тестировщик");
        Component c = new Employee("         ", "'Засекреченый' C", 80_000, "Тестировщик");
        Component d = new Employee("         ", "'Засекреченый' D", 80_000, "Тестировщик");
        Component e = new Employee("         ", "'Засекреченый' E", 80_000, "Тестировщик");
        Component antonina = new Composite("      ", "Антонина Николаевна", 48_000, "Бухгалтер");
        Component natalya = new Employee("      ", "Наталья Борисовна", 40_000, "HR");
        Component osip = new Employee("      ", "Осип Абрамович", 40_000, "Юрист");
        Component mila = new Employee("         ", "Мила", 30_000, "Помощник бухгалтера");

        vasya.addComponent(john);
        vasya.addComponent(elizabet);
        vasya.addComponent(kate);

        john.addComponent(petya);
        john.addComponent(zhenya);

        petya.addComponent(lesha);
        petya.addComponent(marat);

        zhenya.addComponent(dasha);
        zhenya.addComponent(kolya);
        zhenya.addComponent(sonya);
        zhenya.addComponent(tolya);

        elizabet.addComponent(a);
        elizabet.addComponent(b);
        elizabet.addComponent(c);
        elizabet.addComponent(d);
        elizabet.addComponent(e);

        kate.addComponent(antonina);
        kate.addComponent(natalya);
        kate.addComponent(osip);

        antonina.addComponent(mila);


        Write write = new Write(vasya);
        write.printComponents();

    }
}
