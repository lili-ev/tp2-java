public class ex4 {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }

    public static Rectangle trouverMaxRectangle(int[][] m) {

        int R = m.length;

        if (R == 0) {
            return new Rectangle();
        }

        int C = m[0].length;

        Rectangle resultat = new Rectangle();
        int[] hauteur = new int[C];

        for (int i = 0; i < R; i++) {

            // Construire l'histogramme
            for (int j = 0; j < C; j++) {

                if (m[i][j] == 1) {
                    hauteur[j]++;
                } else {
                    hauteur[j] = 0;
                }
            }

            // Trouver le plus grand rectangle dans l'histogramme
            for (int left = 0; left < C; left++) {

                int hauteurMin = hauteur[left];

                for (int right = left; right < C; right++) {

                    hauteurMin = Math.min(hauteurMin, hauteur[right]);

                    int area = hauteurMin * (right - left + 1);

                    if (area > resultat.area) {

                        resultat.area = area;
                        resultat.left = left;
                        resultat.right = right;
                        resultat.bottom = i;
                        resultat.top = i - hauteurMin + 1;
                    }
                }
            }
        }

        return resultat;
    }

    public static void main(String[] args) {

        int[][] m = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        Rectangle r = trouverMaxRectangle(m);

        System.out.println("Aire maximale : " + r.area);
        System.out.println("top = " + r.top);
        System.out.println("left = " + r.left);
        System.out.println("bottom = " + r.bottom);
        System.out.println("right = " + r.right);
    }
}
