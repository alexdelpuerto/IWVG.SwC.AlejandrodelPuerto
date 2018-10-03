package forgeTest;

import forge.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private int number;
    private String name;
    private String familyName;

    @BeforeEach
    void before(){
        number = 4;
        name = "Alex";
        familyName = "del Puerto";
        user = new User(number, name, familyName);
    }
    @Test
    void testFullName(){
        assertNotNull(this.user.fullName());
    }

}