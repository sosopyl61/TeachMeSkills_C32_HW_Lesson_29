package by.rymtsov.D.wrong;

public class UserController {
    private EmailNotificationService emailNotificationService = new EmailNotificationService();

    public void notifyUser() {
        emailNotificationService.sendEmail("Hello, User!");
    }
}
