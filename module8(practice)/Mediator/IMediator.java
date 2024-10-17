public interface IMediator {
    void sendMessage(String message,IUser user);
    void addUser(IUser user);
    void RemoveUser(IUser user);
}
