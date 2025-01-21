public class User implements IUserObserver {

    private String message;
    private String nom;

    @Override
    public void recevoirNotification(String message) {
        this.message = message;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNotification() {
        return this.message;
    }
}
