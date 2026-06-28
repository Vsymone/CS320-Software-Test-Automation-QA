package Contact;

public class Contact {

    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String contactId, String firstName, String lastName, String phone) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
