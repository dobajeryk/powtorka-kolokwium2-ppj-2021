package latwe;

public class Zadanie2 {
    public static void main(String[] args) {
        /*
        Dana jest tablica int
        int [] tab = {1, 2, 3, 4, 4, 3, 2, 1};
        Twoje zadanie polega na wypisaniu booleana (true lub false) w zależności od tego czy liczby w tej tablicy
        są palindromem (https://pl.wikipedia.org/wiki/Palindrom) czy nie.
        Co to palindrom w skrócie?
        Wyrażenie brzmiące tak samo czytane od lewej do prawej i od prawej do lewej.
         */
        int [] tab = {1, 2, 3, 4, 4, 3, 2, 1};
        /*
        0 vs ostatni (7) - i = 0; tab.length - 1 = 7
        1 vs 6 - i = 1; tab.length - 1 - i = 6
        2 vs 5 - i = 2; tab.length - 1 i 2 = 5

         */
        boolean palindrom = true;
        for (int i = 0; i < tab.length / 2; i++) {
            if (tab[i] != tab[tab.length - 1 - i]) {
                palindrom = false;
            }
        }
        System.out.println(palindrom);
    }
}
