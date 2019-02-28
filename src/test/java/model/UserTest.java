package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private final String VALID_EMAIL = "john@example.com";
    private final String VALID_NAME = "John";

    public UserTest() {

    }

    @Test
    public void shouldWork() {
        User user = new User(VALID_EMAIL, VALID_NAME);
        assertNotNull(user);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emailShouldNotBeNull() {
        new User(null, VALID_NAME);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nameShouldNotBeNull() {
        new User(VALID_EMAIL, null);
    }

}
