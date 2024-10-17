public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        User user1 = new User(chatMediator, "Алиса");
        User user2 = new User(chatMediator, "Боб");
        User user3 = new User(chatMediator, "Чарли");

        chatMediator.RegisterColleague(user1);
        chatMediator.RegisterColleague(user2);
        chatMediator.RegisterColleague(user3);

        user1.Send("Привет всем!");
        user2.Send("Привет, Алиса!");
        user3.Send("Всем привет!");
    }
}
