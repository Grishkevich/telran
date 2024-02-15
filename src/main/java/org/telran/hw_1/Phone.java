package org.telran.hw_1;

public class Phone {
    private String number, model;
    private int weight;


    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Nмя звонящего " + name);
    }


}
