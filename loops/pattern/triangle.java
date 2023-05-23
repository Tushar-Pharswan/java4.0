package loops.pattern;

public class triangle {
    public static void main(String[] args) {
        int z=0;
        for (int i = 0; i <= 3; i++) {
            for (int j = -3; j <= 3; j++) {
                if (j >= -i && j <= i) {
                    z++;
                    System.out.print(z);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
