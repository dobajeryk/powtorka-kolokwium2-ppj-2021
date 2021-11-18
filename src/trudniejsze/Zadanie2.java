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
        char[] znaki = {'k', 'o', 'k', 'o', 's'};
        // zliczenie ile razy wystapil dany znak
        int[] tablicaPomocnicza = new int[128];
        for (int i = 0; i < znaki.length; i++) {
            int wartoscAscii = znaki[i];
            tablicaPomocnicza[wartoscAscii] += 1;
        }
        for (int i = 0; i < tablicaPomocnicza.length; i++) {
            if (tablicaPomocnicza[i] != 0) {
                System.out.println("Znak: " + (char) i + " wystąpił : " + tablicaPomocnicza[i] + " razy");
            }
        }
    }
}
