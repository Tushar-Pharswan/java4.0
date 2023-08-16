package DSA.Sheet.Day3Arrays;

class ss {
    static void rat(int maze[][], int right, int down, String ans) {

        int count =0;
        if (right == maze.length - 1 && down == maze.length-1) {
            
            System.out.println(count);
            return;
        }
        if(right<maze.length-1){
            count++;
        rat(maze, right + 1, down, ans+'R');
        }
        if(down<maze.length-1){
            count++;
        rat(maze, right, down+1, ans+'D');
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 },
        };
        rat(maze, 0, 0, "");
    }
}
