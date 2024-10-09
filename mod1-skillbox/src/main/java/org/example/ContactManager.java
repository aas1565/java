package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private String filePath;

    public ContactManager(String filePath) {
        this.filePath = filePath;
        loadContactsFromFile();
    }

    public void loadContactsFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    contacts.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке файлов: " + e.getMessage());
        }
    }

    public void saveContactsToFile() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {
            for (Contact contact : contacts) {
                writer.write(contact.toFileFormat());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файлов: " + e.getMessage());
        }
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContactByEmail(String email) {
        contacts.removeIf(contact -> contact.email.equals(email));
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}