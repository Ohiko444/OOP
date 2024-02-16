package Worker;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Worker.Builder(1, "Иванов Сергей Анатольевич").makeSalary(50000).build());
        System.out.println(new Worker.Builder(2, "Газизов Равгат Маратович").makeSalary(80000).makePosition("тестировщик").build());

        Worker worker = new Worker.Builder(3, "Додонова Диана Сергеевна").makeSalary(60000).makePosition("JAVA разработчик").makeProjectName("игра 'Cyberpunk 2'").build();
        System.out.println(worker);

    }

}
