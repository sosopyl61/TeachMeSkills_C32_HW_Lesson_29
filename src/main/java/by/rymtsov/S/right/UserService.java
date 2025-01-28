package by.rymtsov.S.right;

public class UserService {
    public void registerUser(User user) {
        System.out.println("Register user " + user.getName());
    }

    public void deleteUser(User user) {
        System.out.println("Deleting user " + user.getName());
    }
}
