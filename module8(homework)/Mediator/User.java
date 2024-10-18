public abstract class User {
    protected IMediator mediator;
    protected String name;

    public User(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public void sendPrivateMessage(String message, String receiverName) {
        mediator.sendPrivateMessage(message, this, receiverName);
    }

    public abstract void receiveMessage(String message, String sender);
}

