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
        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean palindrom = true;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != tab[tab.length - i - 1]) {
                palindrom = false;
            }
        }
        System.out.println(palindrom);
    }
}
