package desafiosLivresIA;

import java.util.ArrayList;

import java.util.List;

public class Challenge4 {
    public static ArrayList<ArrayList<Integer>> findSnakeOnGrid(ArrayList<String> grid) {
        // x == "letra"  letter
        // y == "palavra" word


        ArrayList<ArrayList<Integer>> findSnakeOnGrid = new ArrayList<>();

        // <lista das coordenadas< par das coordenada>>

        for (int y = 0; y < grid.size(); y++) {
            String word = grid.get(y);
            for (int x = 0; x < word.length(); x++) {

                if (word.charAt(x) == 'h') { //encontar a cabeça
                    addCoord(findSnakeOnGrid, x, y);
                    scrollThrough(findSnakeOnGrid, grid);

                }

            }
        }
        return findSnakeOnGrid;
    }

    private static void addCoord(ArrayList<ArrayList<Integer>> result, int x, int y) {
        ArrayList<Integer> pairXY = new ArrayList<>();
        pairXY.add(x);
        pairXY.add(y);
        result.add(pairXY);

    }

    private static void scrollThrough(ArrayList<ArrayList<Integer>> result, List<String> grid) {
        ArrayList<Integer> last = result.get(result.size() - 1); //pegar o último "parzinho"
        int x = last.get(0);
        int y = last.get(1);


        if (x > 0) {
            var left = grid.get(y).charAt(x - 1);
            if (left == '>') {
                addCoord(result, x - 1, y);
                scrollThrough(result, grid);
                return;
            }
        }

        if (x < grid.get(y).length() - 1) {
            var right = grid.get(y).charAt(x + 1);
            if (right == '<') {
                addCoord(result, x + 1, y);
                scrollThrough(result, grid);
                return;
            }
        }

        if (y > 0) {
            var top = grid.get(y - 1).charAt(x);
            if (top == 'v') {
                addCoord(result, x, (y - 1));
                scrollThrough(result, grid);
                return;
            }
        }

        if (y < grid.size() - 1) {
            var bottom = grid.get(y + 1).charAt(x);
            if (bottom == '^') {
                addCoord(result, x, (y + 1));
                scrollThrough(result, grid);
                return;
            }
        }

    }
}
