package DSA.array;

public class barChart {
    public static void main(String[] args) {
        int bar[] = { 3, 2, 1, 0, 5, 6 };
        int max = bar[0];

        for (int i = 0; i < bar.length; i++) {
            if (max < bar[i]) {
                max = bar[i];
            }
        }

        for (int row = max; row > 0; row--) {
            for (int column = 0; column < bar.length; column++) {
                if (bar[column] >= row) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
