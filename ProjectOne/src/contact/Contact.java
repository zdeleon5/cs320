package contact;

public class Contact {
    private final String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String id, String firstName, String lastName, String phone, String address) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("id cannot be null or longer than 10 characters");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("firstName cannot be null or longer than 10 characters");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("lastName cannot be null or longer than 10 characters");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("phone cannot be null or longer/shorter than 10 characters");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("address cannot be null or longer than 30 characters");
        }

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }


    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("address cannot be null or longer than 30 characters");
        }
        this.address = address;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("firstName cannot be null or longer than 10 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("lastName cannot be null or longer than 10 characters");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() > 10) {
            throw new IllegalArgumentException("phone cannot be null or longer than 10 characters");
        }
        this.phone = phone;
    }
}
