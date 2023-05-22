package loops.pattern;

public class L_1_23_456_789 {
    public static void main(String[] args) {
        int z = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                z++;
                System.out.print(z);
            }
            System.out.println();
        }
    }

}
