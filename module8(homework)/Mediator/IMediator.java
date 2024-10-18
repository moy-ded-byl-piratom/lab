public interface IMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
    void removeUser(User user);
    void sendPrivateMessage(String message, User sender, String receiverName);
}
