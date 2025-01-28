package by.rymtsov.D.right;

public class UserController {
    private NotificationService notificationService;

    public UserController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        notificationService.sendNotification("Hello, User!");
    }
}
