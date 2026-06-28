package Contact;

import java.util.HashMap;

public class ContactService {

    private HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate ID");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateFirstName(String id, String firstName) {
        Contact c = contacts.get(id);
        if (c != null) {
            contacts.put(id, new Contact(id, firstName, c.getLastName(), c.getPhone()));
        }
    }

    public void updateLastName(String id, String lastName) {
        Contact c = contacts.get(id);
        if (c != null) {
            contacts.put(id, new Contact(id, c.getFirstName(), lastName, c.getPhone()));
        }
    }

    public void updatePhone(String id, String phone) {
        Contact c = contacts.get(id);
        if (c != null) {
            contacts.put(id, new Contact(id, c.getFirstName(), c.getLastName(), phone));
        }
    }
}