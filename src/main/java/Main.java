import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] argc){
        ileWTekscieSlow("haha hhhha wiwi");
        String[] tab  = {"AAAABB", "CCCCDDD", "XXXXXX"};
        ileLiterWTekscie(tab);
        najdluzszyCiagSpolglosekWSlowie("BBBBAAEEEE");
    }
    public static int ileWTekscieSlow(String slowo){
        int licznik = 0;
        for(int i=0; i<slowo.length()-1; i++) {
            if (slowo.charAt(i) == slowo.charAt(i + 1) && slowo.charAt(i) != ' ') {
                licznik++;
                while(i<slowo.length() && slowo.charAt(i) != ' '){
                    i++;
                }
            }
        }
        //System.out.println(licznik);
        return licznik;
    }
    public static void ileLiterWTekscie(String[] tab){
        double czestotliwosc[] = new double[26];
        double suma = 0;
        for(int i=0; i<tab.length; i++) {
            for(int j = 0; j<tab[i].length(); j++) {
                czestotliwosc[tab[i].charAt(j) - 'A']++;
            }
            suma += tab[i].length();
        }
        for(int j=0; j<26; j++){
            System.out.println((char)('A'+j) + ": " + czestotliwosc[j]);
            System.out.printf("%.2f%%%n", 100*czestotliwosc[j]/suma);
        }
    }
    public static int najdluzszyCiagSpolglosekWSlowie(String slowo){
        int spolgloski = 0;
        int ciag = 0;
        for(int i=0; i<slowo.length(); i++){
            if (slowo.charAt(i)=='A' || slowo.charAt(i)=='E' || slowo.charAt(i)=='O' || slowo.charAt(i)=='U' || slowo.charAt(i)=='I' || slowo.charAt(i)=='Y'
            || slowo.charAt(i) < 'A' || slowo.charAt(i) > 'Z') {
                spolgloski = 0;
            }
            else {
                spolgloski++;
            }
            if (spolgloski > ciag) {
                ciag = spolgloski;
            }
        }
        System.out.print(ciag);
        return ciag;
    }
    public static class Wynik733{
        public int max;
        public int oTakiejSamejDlugosci;
        public String najdluzszyPierwszy;

        public Wynik733(int max, int oTakiejSamejDlugosci, String najdluzszyPierwszy){
            this.max = max;
            this.oTakiejSamejDlugosci = oTakiejSamejDlugosci;
            this.najdluzszyPierwszy = najdluzszyPierwszy;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wynik733 wynik733 = (Wynik733) o;
            return max == wynik733.max &&
                    oTakiejSamejDlugosci == wynik733.oTakiejSamejDlugosci &&
                    Objects.equals(najdluzszyPierwszy, wynik733.najdluzszyPierwszy);
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            return "Wynik733{" +
                    "max=" + max +
                    ", oTakiejSamejDlugosci=" + oTakiejSamejDlugosci +
                    ", najdluzszyPierwszy='" + najdluzszyPierwszy + '\'' +
                    '}';
        }
    }
    public static Wynik733 zadanie733(String slowo){
        int max = 0;
        int tymczasowy = 0;
        int oTakiejSamejDlugosci = 0;
        String najdluzszyPierwszy = "";
        String[] wyrazy = slowo.split(" ");
        for(int i = 0; i<wyrazy.length; i++){
            tymczasowy = najdluzszyCiagSpolglosekWSlowie(wyrazy[i]);
            if(tymczasowy > max) {
                max = tymczasowy;
                oTakiejSamejDlugosci = 0;
                najdluzszyPierwszy = wyrazy[i];
            }
            if(tymczasowy == max && max >0)
                oTakiejSamejDlugosci++;
        }
        //System.out.println(najdluzszyPierwszy);
        return new Wynik733(max, oTakiejSamejDlugosci, najdluzszyPierwszy);
    }
}
