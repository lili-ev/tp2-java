public class ex7 {

    public static int elementMajoritaire(int[] t) {

        if (t.length == 0) {
            return -1;
        }

        int candidat = 0;
        int compteur = 0;

        // Trouver le candidat majoritaire
        for (int x : t) {
            if (compteur == 0) {
                candidat = x;
                compteur = 1;
            } else if (x == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        // Vérifier le candidat
        int occurrences = 0;

        for (int x : t) {
            if (x == candidat) {
                occurrences++;
            }
        }

        if (occurrences > t.length / 2) {
            return candidat;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] t1 = {3, 3, 4, 3, 5};
        int[] t2 = {2, 2, 1, 2, 3, 2, 2};
        int[] t3 = {1, 1, 1, 1};
        int[] t4 = {7};
        int[] t5 = {1, 2, 3, 4};
        int[] t6 = {1, 2, 2, 3};
        int[] t7 = {1, 1, 2, 2};
        int[] t8 = {-1, -1, -1, 2, 3};
        int[] t9 = {-2, -2, -2, -2, 1, 3};
        int[] t10 = {};

        System.out.println(elementMajoritaire(t1));
        System.out.println(elementMajoritaire(t2));
        System.out.println(elementMajoritaire(t3));
        System.out.println(elementMajoritaire(t4));
        System.out.println(elementMajoritaire(t5));
        System.out.println(elementMajoritaire(t6));
        System.out.println(elementMajoritaire(t7));
        System.out.println(elementMajoritaire(t8));
        System.out.println(elementMajoritaire(t9));
        System.out.println(elementMajoritaire(t10));
    }
}
