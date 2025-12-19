package src;

public class User {
    // Indkapsling: Feltet er nu privat i stedet for public
    private String name;

    public User(String name) {
        this.name = name;
    }

    // Getter metode til at tilgå navnet sikkert
    public String getName() {
        return name;
    }

    // Setter metode til at ændre navnet kontrolleret
    public void setName(String name) {
        this.name = name;
    }
}
