package org.telran.hw_1;

public class Main {
    public static void main(String[] args) {
        var personOne = new Person();
        var personTwo = new Person("Ivan", "Ivan Ivanov", 23);

        personOne.setName("Olga");
        personOne.setFullName("Olga Borisova");
        personOne.setAge(22);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();

        System.out.println("------------------------------------------------");

        Phone[] phoneList = {
                new Phone("(555) 555-1234", "Nokia", 160),
                new Phone("(444) 444-4321", "Motorola", 170),
                new Phone("(333) 333-4321", "Samsung", 180)
        };

        for (var phone : phoneList) {
            System.out.println("Number: " + phone.getNumber() + "; Model: " + phone.getModel() + "; Weight: " + phone.getWeight() + ";");
        }

        System.out.println();

        phoneList[0].receiveCall("Olga");
        System.out.println(phoneList[0].getNumber());
        phoneList[1].receiveCall("Ivan");
        System.out.println(phoneList[1].getNumber());
        phoneList[2].receiveCall("Nikita");
        System.out.println(phoneList[2].getNumber());
    }
}
