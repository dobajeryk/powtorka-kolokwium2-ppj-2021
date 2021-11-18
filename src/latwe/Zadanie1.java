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
        char[] doOdwrocenia = {'a', 'b', 'c', 'd', 'e'};
        /*
        d - indeks 3
        length - 4
        length - 1 -3
        i = 0
        4 - 1 - 0 = 3

        c - indeks 2
        length - 4
        length - 1 - 3
        4 - 1 - 1 = 2
         */
        for (int i = 0; i < doOdwrocenia.length / 2; i++) {
            char tmp = doOdwrocenia[doOdwrocenia.length - 1 - i];
            doOdwrocenia[doOdwrocenia.length - 1 - i] = doOdwrocenia[i];
            doOdwrocenia[i] = tmp;
        }

        // wypisanie odwroconej tablicy
        for (int i = 0; i < doOdwrocenia.length; i++) {
            System.out.print(doOdwrocenia[i] + " ");
        }

        /*
        a b c d

        i=0; d b c a
        i=1; d c b a
        i=2; a c b d
        i=3; a b c d
         */
    }
}
