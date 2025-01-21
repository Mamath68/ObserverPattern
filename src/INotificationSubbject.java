public interface INotificationSubbject {
    void add(IUserObserver user);
    void remove(IUserObserver user);
    void publierNotification(String message);
}
