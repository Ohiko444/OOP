package chat2;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new UsersMediator();
        User user1 = new UserImpl(mediator, "Маша");
        User user2 = new UserImpl(mediator, "Даша");
        User user3 = new UserImpl(mediator, "Саша");
        User user4 = new UserImpl(mediator, "Женя");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Завтра пара в 10:10");
        System.out.println();
        user2.send("Хорошо");

    }
}
