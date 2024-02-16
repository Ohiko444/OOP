package MyMediator;

public class ManagerMediator extends Mediator {

    private People Customer;
    private People DeliveryService;
    private People FloralSalon;
    private People Delivery;

    public void send(String msg, People colleague){

        if (Customer == colleague){
            FloralSalon.notify(msg);
        } else if (DeliveryService == colleague){
            Delivery.notify(msg);
        } else if (FloralSalon == colleague) {
            DeliveryService.notify(msg);
        } else if (Delivery == colleague) {
            Customer.notify(msg);
        }

    }

    public void setCustomer(People customer) {Customer = customer;}
    public void setDeliveryService(People deliveryService) {DeliveryService = deliveryService;}
    public void setFloralSalon(People floralSalon) {FloralSalon = floralSalon;}
    public void setDelivery(People delivery) {Delivery = delivery;}
}
