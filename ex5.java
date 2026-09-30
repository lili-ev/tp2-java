public class ex5 {

    public static boolean estPermutationCirculaire(int[] t) {
        int n = t.length;

        if (n == 0) {
            return false;
        }

        boolean[] vu = new boolean[n + 1];

        // Vérifier que t est une permutation de 1 à n
        for (int x : t) {
            if (x < 1 || x > n) {
                return false;
            }

            if (vu[x]) {
                return false;
            }

            vu[x] = true;
        }

        // Trouver la position de 1
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;
                break;
            }
        }

        // Vérifier l'ordre circulaire
        for (int k = 0; k < n; k++) {
            int idx = (pos + k) % n;
            int valeurAttendue = k + 1;

            if (t[idx] != valeurAttendue) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1},
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 1},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4},
            {3, 1, 2, 4, 5},
            {2, 1, 3, 4, 5},
            {4, 1, 2, 3, 5},
            {0, 1, 2, 3, 4},
            {1, 2, 2, 3, 4},
            {1, 2, 3, 4, 6}
        };

        for (int[] t : tests) {
            System.out.println(estPermutationCirculaire(t));
        }
    }
}
