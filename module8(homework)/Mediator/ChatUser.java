public class ChatUser extends User {

    public ChatUser(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.println(name + " получил сообщение от " + (sender != null ? sender : "система") + message);
    }
}
