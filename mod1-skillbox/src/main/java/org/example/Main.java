package org.example;
import java.util.*;

    public class Main {
        private static final String FILE_PATH = "src/main/resources/default-contacts.txt";

        public static void main(String[] args) {
            ContactManager contactManager = new ContactManager(FILE_PATH);
            Scanner scanner = new Scanner(System.in);//позволяет считывать ввод пользователя из стандартного ввода
            String command;

            while (true) {
                System.out.print("Введите команду (add/remove/list/exit): ");
                command = scanner.nextLine();//считываем введеную строчку

                switch (command) {
                    case "add":
                        System.out.print("Введите контакт (Ф. И. О.; номер телефона; адрес электронной почты): ");
                        String input = scanner.nextLine();
                        String[] parts = input.split(";");
                        if (parts.length == 3) {
                            contactManager.addContact(new Contact(parts[0].trim(), parts[1].trim(), parts[2].trim()));
                        } else {
                            System.out.println("Неверный формат ввода.");
                        }
                        break;
                    case "remove":
                        System.out.print("Введите адрес электронной почты для удаления: ");
                        String email = scanner.nextLine();
                        contactManager.removeContactByEmail(email);
                        break;
                    case "list":
                        contactManager.displayContacts();
                        break;
                    case "exit":
                        contactManager.saveContactsToFile();
                        System.exit(0);
                    default:
                        System.out.println("Неизвестная команда.");
                }
            }
        }
    }

