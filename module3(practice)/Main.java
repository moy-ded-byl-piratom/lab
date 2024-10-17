public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User user1 = new User();
        user1.setName("A");
        user1.setEmail("a@example.com");
        user1.setRole("Admin");

        User user2 = new User();
        user2.setName("B");
        user2.setEmail("b@example.com");
        user2.setRole("User");

        userManager.addUser(user1);
        userManager.addUser(user2);

        userManager.updateUser("Aa", "aa@example.com", "Super Admin");
        userManager.removeUser("B");
    }
}