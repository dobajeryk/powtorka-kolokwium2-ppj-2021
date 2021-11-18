package trudniejsze;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        Napisz program, który zamieni liczbę z systemu dziesiętnego na system ósemkowy.
        Liczbę zapisaną w systemie ósemkowym zapisz w tablicy typu char a następnie wypisz tablicę.
        Np. dla liczby 1271 (dziesiętnej) powinen wypisać 2367 (reprezentacja tej liczby w systemie ósemkowym).
         */
        int liczbaDziesietna = 1271;
        int kopiaDziesietnej = liczbaDziesietna;
        // sprawdzamy z ilu cyfr bedzie skladac sie nasza liczba w zapisie ósemkowym
        int rozmiarTablicy = 0;
        while (kopiaDziesietnej > 0) {
            kopiaDziesietnej /= 8;
            rozmiarTablicy++;
        }
        // tworzymy tablice o tym rozmiarze
        char ósemkowo[] = new char[rozmiarTablicy];
        kopiaDziesietnej = liczbaDziesietna;
        int i = 0;
        while (kopiaDziesietnej > 0) {
            ósemkowo[rozmiarTablicy - 1 - i] = (char) (kopiaDziesietnej % 8);
            kopiaDziesietnej /= 8;
            i++;
        }
        for (int j = 0; j < ósemkowo.length; j++) {
            System.out.print((int)ósemkowo[j] + " ");
        }
    }
}
