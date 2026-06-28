package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("111", "John", "Doe", "1234567890");

        assertDoesNotThrow(() -> service.addContact(c));
    }

    @Test
    public void testDuplicateContact() {
        ContactService service = new ContactService();

        service.addContact(new Contact("111", "John", "Doe", "1234567890"));

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(new Contact("111", "Jane", "Smith", "9999999999"));
        });
    }
}