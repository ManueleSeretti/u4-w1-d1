public class esercizio3 {
    public static void main(String[] args) {
        System.out.println("il perimetro del rettangolo è " + perimetroRettangolo(12.3, 14.5));
        System.out.println(pariDispari(3));
        System.out.println("l'area del triangolo è: " + formulaErone(2.4, 3.4, 4.5));
    }

    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    public static int pariDispari(int n1) {
        if (n1 % 2 == 0) {
            return 0;
        }
        return 1;
    }

    public static double formulaErone(double l1, double l2, double l3) {
        return Math.sqrt((l1 + l2 + l3) * (-l1 + l2 + l3) * (l1 - l2 + l3) * (l1 + l2 - l3)) / 4;
    }
}
