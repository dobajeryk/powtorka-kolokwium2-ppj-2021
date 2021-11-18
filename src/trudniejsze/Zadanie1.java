package trudniejsze;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        Napisz program, który zamieni liczbę z systemu dziesiętnego na system ósemkowy.
        Liczbę zapisaną w systemie ósemkowym zapisz w tablicy typu char a następnie wypisz tablicę.
        Np. dla liczby 1271 (dziesiętnej) powinen wypisać 2367 (reprezentacja tej liczby w systemie ósemkowym).
         */
        int liczbaDziesietna = 1271; // 2367
        int kopiaDziesietnej = liczbaDziesietna;
        int rozmiarTablicy = 0;
        while (kopiaDziesietnej > 0) {
            kopiaDziesietnej /= 8;
            rozmiarTablicy++;
        }
        char[] osemowko = new char[rozmiarTablicy];
        kopiaDziesietnej = liczbaDziesietna;
        int licznik = 1;
        while (kopiaDziesietnej > 0) {
            osemowko[rozmiarTablicy - licznik] = (char) (kopiaDziesietnej % 8);
//            kopiaDziesietnej /= 8;
            kopiaDziesietnej = kopiaDziesietnej / 8;
            licznik++;
        }
        // wypisanie
        for (int i = 0; i < osemowko.length; i++) {
            System.out.print((int)osemowko[i] + " ");
        }
        /*
        1271 / 8 r7
        158 / 8 r6
        19      r3
               r2
         */
    }
}
