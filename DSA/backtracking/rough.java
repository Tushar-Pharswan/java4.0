package DSA.backtracking;

public class rough {
    static void rat(int maze[][], int right, int down, int ans) {
        
        if (right == maze.length - 1 && down == maze.length - 1) {
            System.out.println(count);
            return;
        }
        int count=0;
        for (int i=0 ; i<maze.length;i++){
        if (right < maze.length - 1) {
            rat(maze, right + 1, down, ans);
        }
        if (down < maze.length - 1) {
            rat(maze, right, down + 1, ans);
        }

        count++;
    }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
        };
        rat(maze, 0, 0, 0);
    }
}
