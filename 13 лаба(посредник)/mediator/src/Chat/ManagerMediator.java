package Chat;

public class ManagerMediator extends Mediator {

    public People Masha;
    public People Sasha;
    public People Dasha;

    public void send(String msg, People colleague){

        if (Masha == colleague){
            Masha.write(msg);
            Dasha.notify(msg);
            Sasha.notify(msg);
            System.out.println("--");
        } else if (Sasha == colleague){
            Sasha.write(msg);
            Dasha.notify(msg);
            Masha.notify(msg);
            System.out.println("--");
        } else if (Dasha == colleague) {
            Dasha.write(msg);
            Masha.notify(msg);
            Sasha.notify(msg);
            System.out.println("--");
        }
    }

}
