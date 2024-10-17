public class MainMediator {
    public static void main(String[] args) {
        ChatMediator chat = new ChatMediator();
        IUser user1 = new User("User1", chat);
        IUser user2 = new User("User2", chat);
        IUser user3 = new User("User3", chat);

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Hello everyone");

    }
}
