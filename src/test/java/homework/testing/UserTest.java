package homework.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void userCreationTest() {
        User user = new User("coat", "shuba@shuba.sh");
        String actualLoginResult = user.getLogin();
        String actualEmailResult = user.getEmail();
        Assertions.assertNotNull(actualLoginResult);
        Assertions.assertNotNull(actualEmailResult);
    }

    @Test
    public void userCreationNullTest() {
        User user = new User();
        String actualLoginResult = user.getLogin();
        String actualEmailResult = user.getEmail();
        Assertions.assertNull(actualLoginResult);
        Assertions.assertNull(actualEmailResult);
    }

    @Test
    public void emailCorrectTest() {
        User user = new User("coat", "shuba@shuba.sh");
        String actual = user.getEmail();
        Assertions.assertEquals("shuba@shuba.sh", actual);
    }

    @Test
    public void emailNotEqualLoginTest() {
        User user = new User("coat", "shuba@shuba.sh");
        String actualLogin = user.getLogin();
        String actualEmail = user.getEmail();
        Assertions.assertNotSame(actualEmail, actualLogin);
    }
}