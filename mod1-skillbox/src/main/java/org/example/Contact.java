package org.example;

class Contact {
    String fullName;
    String phoneNumber;
    String email;

    public Contact(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return fullName + " | " + phoneNumber + " | " + email;
    }

    public String toFileFormat() {
        return fullName + ";" + phoneNumber + ";" + email;
    }
}
