package contact;

import java.util.ArrayList;

public class ContactService {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String id, String firstName, String lastName, String phone, String address) {
        Contact contact = new Contact(id, firstName, lastName, phone, address);
        contacts.add(contact);
    }

    public void removeContact(String contactID) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(contactID)) {
                contacts.remove(contact);
                break;
            }
        }
    }

    public void updateFirstName(String contactID, String firstName) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(contactID)) {
                contact.setFirstName(firstName);
                break;
            }
        }
    }

    public void updateLastName(String contactID, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(contactID)) {
                contact.setLastName(lastName);
                break;
            }
        }
    }

    public void updatePhoneNumber(String contactID, String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(contactID)) {
                contact.setPhone(phoneNumber);
                break;
            }
        }
    }

    public void updateAddress(String contactID, String address) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(contactID)) {
                contact.setAddress(address);
                break;
            }
        }
    }
}
