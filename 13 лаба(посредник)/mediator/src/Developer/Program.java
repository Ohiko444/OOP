package Developer;

public class Program {

    public static void main(String[] args) {

        ManagerMediator mediator = new ManagerMediator();
        Colleague customer = new CustomerColleague(mediator);
        Colleague programmer = new ProgrammerColleague(mediator);
        Colleague tester = new TesterColleague(mediator);
        Colleague designer = new DesignerColleague(mediator);
        Colleague writer = new TechnicalWriterColleague(mediator);

        mediator.setCustomer(customer);
        mediator.setProgrammer(programmer);
        mediator.setTester(tester);
        mediator.setDesigner(designer);
        mediator.setWriter(writer);

        customer.send("Есть заказ, надо сделать программу");
        programmer.send("Программа готова, надо оформить дизайн");
        designer.send("Программа готова, надо протестировать");
        tester.send("Программа протестирована и готова к документированию");
        writer.send("Программа имеет документацию и готова к продаже");
    }

}
