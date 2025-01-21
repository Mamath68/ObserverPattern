import java.util.ArrayList;
import java.util.List;

public class SujetNotification implements INotificationSubbject {
    private List<IUserObserver> users;
    private String message;

    public SujetNotification() {
        users = new ArrayList<>();
    }

    @Override
    public void add(IUserObserver user) {
        users.add(user);
    }

    @Override
    public void remove(IUserObserver user) {
        users.remove(user);
    }

    @Override
    public void publierNotification(String message) {
        for (IUserObserver o : users) {
            o.recevoirNotification(message);
        }
    }

    public void setNotification(String message) {
        this.message = message;
        publierNotification(message);
    }

}
