import java.util.Arrays;

public class esercizio1 {
    public static void main(String[] args) {
        String[] arreyElement = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5"};
        String newElement = "nuovoElemento";
        System.out.println(moltiplica(3, 5));
        System.out.println(concatena("ciao", 5));
        System.out.println("l'arrey iniziale è : " + Arrays.toString(arreyElement));
        System.out.println("l'arrey finale è : " + Arrays.toString(inserisciInArrey(arreyElement, newElement)));


    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String str, int n1) {
        return str + " " + n1;
    }

    public static String[] inserisciInArrey(String[] strArrey, String str) {
        String[] risultato = new String[6];
        risultato[0] = strArrey[0];
        risultato[1] = strArrey[1];
        risultato[2] = str;
        risultato[3] = strArrey[2];
        risultato[4] = strArrey[3];
        risultato[5] = strArrey[4];
        return risultato;
    }
}
