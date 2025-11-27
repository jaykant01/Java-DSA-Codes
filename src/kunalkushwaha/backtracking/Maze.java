package kunalkushwaha.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true,true,true}
        };
        //System.out.println(countPath(3,3));
        //printpath("",3,3);
        //System.out.println(pathList("", 3, 3));
        //System.out.println(pathDiagonal("",3,3));
        pathObstacles("", board, 0, 0);
    }
    static int countPath(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countPath(r+1, c);
        int right = countPath(r, c+1);
        return left+right;
    }

    // Print path
    static void printpath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if( r > 1){
            printpath(p + 'D', r-1, c);
        }
        if(c > 1){
            printpath(p + 'R', r, c-1);
        }
    }

    // Return path in arrayList
    static ArrayList<String> pathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if( r > 1){
            ans.addAll(pathList(p + 'D', r-1, c));
        }
        if(c > 1){
            ans.addAll(pathList(p + 'R', r, c-1));
        }
        return ans;
    }

    // Now we can also go on Diagonal Advanced version
    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1 && c> 1){
            ans.addAll(pathDiagonal(p + 'D', r-1, c-1));
        }
        if( r > 1){
            ans.addAll(pathDiagonal(p + 'V', r-1, c));
        }
        if(c > 1){
            ans.addAll(pathDiagonal(p + 'H', r, c-1));
        }
        return ans;
    }

    // Maze problem with river obstacles at 1,1
    static void pathObstacles(String p, boolean[][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if( r < maze.length-1){
            pathObstacles(p + 'D', maze ,r+1, c);
        }
        if(c < maze[0].length-1){
            pathObstacles(p + 'R', maze,r, c+1);
        }
    }


}
