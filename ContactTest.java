package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreation() {
        Contact c = new Contact("111", "John", "Doe", "1234567890");

        assertEquals("111", c.getContactId());
        assertEquals("John", c.getFirstName());
    }
}