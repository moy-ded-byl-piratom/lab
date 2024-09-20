public class EmailNotification implements INotification {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        // Реализация
    }
}