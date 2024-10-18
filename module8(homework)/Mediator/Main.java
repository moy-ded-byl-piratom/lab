public class Main {
    public static void main(String[] args) {
        IMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Алиса");
        User user2 = new ChatUser(chatRoom, "Боб");
        User user3 = new ChatUser(chatRoom, "Чарли");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Привет всем!");
        user2.sendPrivateMessage("Привеи!", "Алиса");

        chatRoom.removeUser(user3);

        user1.sendPrivateMessage("Ты еще здесь?", "Чарли");
    }
}
