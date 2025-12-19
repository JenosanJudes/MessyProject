package src;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        // Opretter test-data
        userList.addUser(new User("Jenosan"));
        userList.addUser(new User("Michael"));

        // Bruger den nye find-metode fra UserList (SRP)
        String searchName = "Jenosan";
        User foundUser = userList.findUserByName(searchName);

        if (foundUser != null) {
            // Bruger getName() i stedet for direkte felt-adgang
            System.out.println("Bruger fundet: " + foundUser.getName());
        } else {
            System.out.println("Bruger ikke fundet.");
        }
    }
}
