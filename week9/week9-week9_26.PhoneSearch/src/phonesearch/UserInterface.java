/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Kenny
 */
public class UserInterface {

    private Scanner reader;
    private Set<Person> phonebook;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.phonebook = new HashSet<Person>();
    }

    public void start() {
        System.out.println("phone search");

        displayAvailableOperations();
        handleCommands();
    }

    private void displayAvailableOperations() {
        System.out.println("available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit\n");
    }

    private void handleCommands() {
        String command = "";
        int intCommand = 0;

        while (!command.equals("x")) {
            System.out.print("command: ");
            command = this.reader.nextLine();

            if (command.equals("x")) {
                return;
            }

            try {
                intCommand = Integer.parseInt(command);
            } catch (NumberFormatException e) {
                command = "";
            }

            switch (intCommand) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    getNumbersByName();
                    break;
                case 3:
                    getPersonByNumber();
                    break;
                case 4:
                    addAddress();
                    break;
                case 5:
                    getPersonalInfo();
                    break;
                case 6:
                    deletePersonalInfo();
                    break;
                case 7:
                    getFilteredResults();
                    break;
                default:
                    System.out.println("Please enter a valid command");
                    command = "";
            }
            System.out.println("");
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();
        System.out.print("number: ");
        String number = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameEquals(name)) {
                person.addNumber(number);
                return;
            }
        }

        this.phonebook.add(new Person(name, number));
    }

    private void getNumbersByName() {
        System.out.print("whose number: ");
        String name = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameEquals(name)) {
                printNumbers(person.getNumbers());
                return;
            }
        }

        System.out.println("  not found");
    }

    private void printNumbers(Set<String> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("  not found");
        }
        for (String number : numbers) {
            System.out.println(" " + number);
        }
    }

    private void getPersonByNumber() {
        System.out.print("number: ");
        String number = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.hasNumber(number)) {
                System.out.println(" " + person.getName());
                return;
            }
        }

        System.out.println(" not found");
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = this.reader.nextLine();
        System.out.print("street: ");
        String street = this.reader.nextLine();
        System.out.print("city: ");
        String city = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameEquals(name)) {
                person.setAddress(street, city);
                return;
            }
        }

        this.phonebook.add(new Person(name, street, city));
    }

    private void getPersonalInfo() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameEquals(name)) {
                System.out.print(person.toString());
                return;
            }
        }

        System.out.println("  not found");
    }

    private void deletePersonalInfo() {
        System.out.print("whose information: ");
        String name = this.reader.nextLine();

        for (Person person : this.phonebook) {
            if (person.nameEquals(name)) {
                person.removeAddress();
                person.removeNumbers();
            }
        }
    }

    private void getFilteredResults() {
        System.out.print("keyword (if empty, all listed): ");
        String filter = this.reader.nextLine();
        List<Person> results = new ArrayList<Person>();
        System.out.println("");

        for (Person person : this.phonebook) {
            if (person.getName().contains(filter)
                    || (person.getAddress() != null && person.getAddress().toString().contains(filter))) {
                results.add(person);
            }
        }

        if (!results.isEmpty()) {
            Collections.sort(results);

            for (Person person : results) {
                System.out.println(" " + person.getName());

                if (person.getAddress() == null) {
                    System.out.println("  address unknown");
                } else {
                    System.out.println("  address: " + person.getAddress());
                }

                if (person.getNumbers().isEmpty()) {
                    System.out.println("  phone number not found");
                } else {
                    System.out.println("  phone numbers:");
                    for (String number : person.getNumbers()) {
                        System.out.println("   " + number);
                    }
                }
            }
        } else {
            System.out.println(" keyword not found");
        }
    }

} // END OF CLASS
