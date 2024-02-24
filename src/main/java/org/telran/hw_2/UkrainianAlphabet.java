package org.telran.hw_2;

import java.util.Arrays;

public class UkrainianAlphabet extends Alphabet {

    public UkrainianAlphabet() {
        setName("Ukrainian");
    }

    private char[] alphabet =
            {
                    'А', 'а',
                    'Б', 'б',
                    'В', 'в',
                    'Г', 'г',
                    'Ґ', 'ґ',
                    'Д', 'д',
                    'Е', 'е',
                    'Є', 'є',
                    'Ж', 'ж',
                    'З', 'з',
                    'И', 'и',
                    'І', 'і',
                    'Ї', 'ї',
                    'Й', 'й',
                    'К', 'к',
                    'Л', 'л',
                    'М', 'м',
                    'Н', 'н',
                    'О', 'о',
                    'П', 'п',
                    'Р', 'р',
                    'С', 'с',
                    'Т', 'т',
                    'У', 'у',
                    'Ф', 'ф',
                    'Х', 'х',
                    'Ц', 'ц',
                    'Ч', 'ч',
                    'Ш', 'ш',
                    'Щ', 'щ',
                    'Ь', 'ь',
                    'Ю', 'ю',
                    'Я', 'я'
            };


    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println(": " + Arrays.toString(alphabet));
    }
}
