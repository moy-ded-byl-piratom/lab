public class OrderNotificationService {
    private INotification notification;

    public OrderNotificationService(INotification notification) {
        this.notification = notification;
    }

    public void notifyStatusChange(Order order, String newStatus) {
    }
}
