package org.telran.hw_2;

public class Main {
    public static void main(String[] args) {
        var ukrainian = new UkrainianAlphabet();
        var english = new EnglishAlphabet();
        var german = new GermanAlphabet();
        ukrainian.printAlphabet();
        english.printAlphabet();
        german.printAlphabet();

        System.out.println("---------------------------------------------");

        printAllInfo(new Alphabet[]{ukrainian, english, german});
    }

    public static void printAllInfo(Alphabet[] alphabets) {
        for (var alphabet : alphabets) {
            alphabet.printAlphabet();
        }
    }
}
