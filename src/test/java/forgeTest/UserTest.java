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
    void before() {
        number = 4;
        name = "Alex";
        familyName = "del Puerto";
        user = new User(number, name, familyName);
    }

    @Test
    void testFullName() {
        assertNotNull(this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("A.", this.user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(4, this.user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Alex", this.user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Del puerto", this.user.getFamilyName());
    }
}