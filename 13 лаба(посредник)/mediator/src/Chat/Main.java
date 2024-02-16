package Chat;

public class Main {

    public static void main(String[] args) {

        ManagerMediator mediator = new ManagerMediator();
        People dasha = new Dasha(mediator);
        People masha = new Masha(mediator);
        People sasha = new Sasha(mediator);


        mediator.Dasha = dasha;
        mediator.Masha = masha;
        mediator.Sasha = sasha;


        System.out.println("----------------БЕСЕДА ГРУППЫ-----------------------");
        dasha.send("Всем привет, завтра пара начинается в 13:50");
        masha.send("Хорошо, а в каком кабинете?");
        sasha.send("А я заболел и не приду");
        dasha.send("Пара будет в 1110. А насчёт болезни сообщу преподавателю");
    }

}
