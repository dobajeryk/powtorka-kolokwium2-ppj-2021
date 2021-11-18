package trudniejsze;

public class Zadanie2 {
    public static void main(String[] args) {
        /*
        Dana jest tablica
        char znaki [] =  {'k', 'o', 'k', 'o', 's'};
        Napisz program, który wypisz ile razy wystąpił każdy ze znaków.
        Dla danego przykładu program powinen wypisać:
        Znak k wystąpił 2 razy
        Znak o wystąpił 2 razy
        Znak t wystąpił 1 razy
         */
        /*
        k - 66
        o - 58
        s - 90
        [66] - ilosc wystapien litery k
        [58] - ilosc wystapien litery o
        ....
         */
        char znaki [] =  {'k', 'o', 'k', 'o', 's'};
        int [] tablicaPomocnicza = new int[1_000];
        for (int i = 0; i < znaki.length; i++) {
            int wartoscAscii = znaki[i];
            tablicaPomocnicza[wartoscAscii]++; // indeks - wartosciAscii, wartośc pod indeksem - ilosc wystapien
        }
        for (int i = 0; i < tablicaPomocnicza.length; i++) {
            if (tablicaPomocnicza[i] != 0) { // jezeli znak o wartosci ascii wystapil chociaz raz
                System.out.println("Znak " + (char) i + " wystapil " + tablicaPomocnicza[i] + " razy");
            }
        }
    }
}
