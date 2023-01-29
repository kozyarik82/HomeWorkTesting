package homework.testing;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        this.login = login;
        String s = "@";
        String t = ".";
        if (email == null) {
            email = "name@email.domen";
        }
        if (!email.contains(s) && !email.contains(t)||email.equals(login)) {
            throw new IncorrectValueException();
        } else {
            this.email = email;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}


