import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        chiediStringhe();
    }

    public static void chiediStringhe() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci 3 stringhe le visualizzera prima nell'ordine corretto e poi al contrario--->");
        System.out.println("Inserisci la prima stringa e premi invio");
        String str1 = input.nextLine();
        System.out.println("Inserisci la seconda stringa e premi invio");
        String str2 = input.nextLine();
        System.out.println("Inserisci la terza stringa e premi invio");
        String str3 = input.nextLine();

        System.out.println("ORDINE GIUSTO :" + str1 + " " + str2 + " " + str3);
        System.out.println("ORDINE INVERSO :" + str3 + " " + str2 + " " + str1);
        input.close();

    }
}
