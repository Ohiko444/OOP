package Developer;

public class ManagerMediator extends Mediator{

    private Colleague Customer;
    private Colleague Programmer;
    private Colleague Tester;
    private Colleague Designer;
    private Colleague Writer;

    public void send(String msg, Colleague colleague){

        if (Customer == colleague){
            Programmer.notify(msg);
        } else if (Programmer == colleague){
            Designer.notify(msg);
        } else if (Tester == colleague) {
            Writer.notify(msg);
        } else if (Designer == colleague) {
            Tester.notify(msg);
        } else if (Writer == colleague) {
            Customer.notify(msg);
        }

    }

    public void setCustomer(Colleague customer) {Customer = customer;}
    public void setWriter(Colleague writer) {Writer = writer;}
    public void setDesigner(Colleague designer) {Designer = designer;}
    public void setTester(Colleague tester) {Tester = tester;}
    public void setProgrammer(Colleague programmer) {Programmer = programmer;}
}
