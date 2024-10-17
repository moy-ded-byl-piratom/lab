import java.util.ArrayList;
import java.util.List;

class UserManager {
    private List<User> users;

    public void addUser(User user) {
        users.add(user);
        System.out.println("added" + user);
    }

    public void removeUser(String name) {
        User userToRemove = findUserByName(name);
        if (userToRemove != null) {
            users.remove(userToRemove);
            System.out.println("removed " + userToRemove);
        } else {}
    }

    public void updateUser(String name, String newEmail, String newRole) {
        User userToUpdate = findUserByName(name);
        if (userToUpdate != null) {
            userToUpdate.setEmail(newEmail);
            userToUpdate.setRole(newRole);
            System.out.println("Updated " + userToUpdate);
        } else {}
    }

    private User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}