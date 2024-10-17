import java.util.List;
public class ChatMediator implements IMediator{
    private List<IUser> users;
    @Override
    public void sendMessage(String message, IUser sender) {
        for(IUser user : users){
            if(user!=sender){
                user.ReceiveMessage(message, sender);
            }
        }
    }

    @Override
    public void addUser(IUser user) {
        users.add(user);
        NotifyUsers(user.getName()+" join");
    }

    @Override
    public void RemoveUser(IUser user) {
        users.remove(user);
        NotifyUsers(user.getName()+" left");
    }
    public void NotifyUsers(String message) {
        for (IUser user : users) {
            user.ReceiveSystemMessage(message);
        }
    }
}
