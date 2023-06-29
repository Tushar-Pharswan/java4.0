package loops.pattern;
//not complete

public class triangle {
    public static void main(String[] args) {
        int z = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = -3; j <= 3; j++) {
                if (j >= -i && j <= i) {
                    // z++;
                    if (i % 2 == 0) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }

                }
                if (i % 2 != 0) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
    }

}