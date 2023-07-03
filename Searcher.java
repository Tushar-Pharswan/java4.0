public class Searcher{

    public static void recursiveMethod(int n) {
    if (n > 0) {
        recursiveMethod(n - 2);
        System.out.print(n + " ");
        recursiveMethod(n - 4);
    }
}
}