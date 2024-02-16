package MyMediator;

public class Main {

    public static void main(String[] args) {

        ManagerMediator mediator = new ManagerMediator();
        People customer = new Customer(mediator);
        People deliveryService = new DeliveryService(mediator);
        People floralSalon = new FloralSalon(mediator);
        People delivery = new Delivery(mediator);

        mediator.setCustomer(customer);
        mediator.setDeliveryService(deliveryService);
        mediator.setFloralSalon(floralSalon);
        mediator.setDelivery(delivery);

        customer.send("Нужна доставка букета");
        floralSalon.send("Букет собран, нужен курьер для доставки");
        deliveryService.send("Нужно доставить букет по адресу");
        delivery.send("Букет доставлен, заберите и оплатите доставку");

    }

}
