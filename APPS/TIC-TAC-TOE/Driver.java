import java.util.Arrays;

class Driver {

    public static void main(String[] args) {

        startGame();

    }

    private static void startGame() {
        System.out.println("Game Start");
        int rows = 3, columns = rows;

        char[][] grid = createGrid(rows, columns);
        for (char[] arr : grid) {
            Arrays.fill(arr, ' ');

        }

        boolean o = false;
        while (true) {
            if (!o) {
                booelan x = player(grid, 'X');
                if (!x) {
                    continue;
                }
            }

            checkWinner(grid);
            o = player(grid, 'O');
            if (!o) {
                o = true;
                continue;
            }
            checkWinner(grid);
            o = player(grid, 'O');
            if (!o) {
                o = true;
                continue;
            }
            checkWinner(grid);
            o = false;
        }
    }

    private static void checkWinner(char[][] grid) {

        int x = 0, o = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (grid[i][j] == 'X') {
                    x++;
                } else if (grid[i][j] == 'O') {
                    o++;
                }
                if (x == 3) {
                    displayGrid(grid);
                    System.out.println("X is winner ");
                    startGame();
                } else if (o == 3) {
                    displayGrid(grid);
                    System.out.println("O is WInner");
                    startGame();
                }
                x = 0;
                o = 0;

            }
        }

        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                if (grid[i][j] == 'X') {
                    x++;
                } else if (grid[i][j] == 'O') {
                    o++;
                }

                if (x == 3) {
                    displayGrid(grid);
                    System.out.println("X IS WINNER ");
                    startGame();
                } else if (o == 3) {
                    displayGrid(grid);
                    System.out.println("O is Winner ");
                }

                x = 0;
                o = 0;
            }

            if ((grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') ||
                    (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')) {
                displayGrid(grid);
                System.out.println("X is winner");
                startGame();
            } else if ((grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
                    || (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')) {
                displayGrid(grid);
                System.out.println("O is Winner ");
                startGame();
            }

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {

                }
            }
        }
    }
}