public class ex8 {

    public static void afficherElementsManquants(int[] t) {
        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        // Marquer les éléments présents
        for (int x : t) {
            if (x >= 1 && x <= n) {
                vu[x] = true;
            }
        }

        // Afficher les éléments manquants
        boolean trouve = false;

        for (int k = 1; k <= n; k++) {
            if (!vu[k]) {
                System.out.print(k + " ");
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.print("Aucun element manquant");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] t1 = {1, 3, 3, 5};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {3, 3, 3};
        int[] t4 = {1, 1, 1, 1};
        int[] t5 = {4, 2, 2, 1, 5};
        int[] t6 = {1};

        afficherElementsManquants(t1);
        afficherElementsManquants(t2);
        afficherElementsManquants(t3);
        afficherElementsManquants(t4);
        afficherElementsManquants(t5);
        afficherElementsManquants(t6);
    }
}
