package latwe;

public class Zadanie3 {
    public static void main(String[] args) {
        /*
        Dana jest tablica int
        int [] tab = {100, 97, 3, 12, 12321, 2324, 1, 1};
        napisz program, który utworzy dwie tablice.
        Pierwsza z nich będzie przechowywać liczby parzyste natomiast druga liczby nieparzyste.
        Uwaga!
        Rozmiar utworzonych tablic powinien być taki, ile jest elementów w tej tablicy. Niedopuszczalne jest stworzenie
        większej tablic niż potrzeba!
         */
        int [] tab = {100, 97, 3, 12, 12321, 2324, 1, 1};
        // zliczenie ile jest liczb parzystych a ile nieparzystych
        int parzyste = 0;
        int nieParzyste = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parzyste++;
            } else {
                nieParzyste++;
            }
        }
        // utworzenie tablic o odpowiednim rozmiarze
        int [] parzysteTab = new int[parzyste];
        int [] nieParzysteTab = new int[nieParzyste];
        // dodanie liczb z tab do odpowiedniej tablicy
        for (int i = 0, licznikParz = 0, licznikNieParz = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parzysteTab[licznikParz++] = tab[i];
            } else {
                nieParzysteTab[licznikNieParz++] = tab[i];
            }
        }
        // wypisanie tablic
        System.out.println("Tablica z liczbami parzystymi");
        for (int i = 0; i < parzysteTab.length; i++) {
            System.out.print(parzysteTab[i] + " ");
        }
        System.out.println();
        System.out.println("Tablica z liczbami nieparzystymi");
        for (int i = 0; i < nieParzysteTab.length; i++) {
            System.out.print(nieParzysteTab[i] + " ");
        }
    }
}
