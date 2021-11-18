package latwe;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        Dana jest tablica char
        char doOdwrocenia [] = {'a', 'b', 'c', 'd'};
        twoim zadaniem jest odwrócenie elementów w tej tablicy (pierwszy element na ostatnim miejscu, ostatni na
        pierwszym itd.). Finalnie nasza tablica powinna wyglądać tak:
        char doOdwrocenia [] = {'d', 'c', 'b', 'a'};
        Uwaga!
        W zadaniu nie możesz użyć żadnej dodatkowej tablicy!
        */
        char[] doOdwrocenia = {'a', 'b', 'c', 'd'};

        // zamiana
        for (int i = 0; i < doOdwrocenia.length / 2; i++) {
            char tmp = doOdwrocenia[i];
            doOdwrocenia[i] = doOdwrocenia[doOdwrocenia.length - 1 -i];
            doOdwrocenia[doOdwrocenia.length - 1 -i] = tmp;
        }
        // wypisanie odwroconej tablicy
        for (int i = 0; i < doOdwrocenia.length; i++) {
            System.out.print(doOdwrocenia[i] + " ");
        }

    }
}
