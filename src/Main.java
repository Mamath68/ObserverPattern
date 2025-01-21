public class Main {
    public static void main(String[] args) {
        SujetNotification notifications = new SujetNotification();
        User user1 = new User();
        User user2 = new User();

        user1.setNom("Mathieu");
        user2.setNom("Philippe");

        notifications.add(user1);
        notifications.add(user2);

        notifications.setNotification(user1.getNom() + " " + "s'est abonnée à " + user2.getNom());

        System.out.println("Un Nouveau Message: " + user1.getNotification());

        System.out.println(" " );

        notifications.remove(user1);
        notifications.setNotification(user1.getNom() + " " + "s'est désabonnée de Vous !");

        System.out.println("Une mauvaise nouvelle pour vous: " + user2.getNotification());

    }
}
