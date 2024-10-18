import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IMediator {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users.values()) {
            if (user != sender) {
                user.receiveMessage(message, sender.getName());
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
        sendMessage("Joined " + user.getName(), null);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getName());
        sendMessage("Left " + user.getName(), null);
    }

    @Override
    public void sendPrivateMessage(String message, User sender, String receiverName) {
        User receiver = users.get(receiverName);
        if (receiver != null) {
            receiver.receiveMessage(message, sender.getName());
        } else {
            sender.receiveMessage(receiverName + " не найден","система");
        }
    }
}

