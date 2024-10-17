public interface IUser {
    void sendMessage(String message);
    void ReceiveMessage(String message, IUser sender);
    void ReceiveSystemMessage(String message);
    String getName();
}
