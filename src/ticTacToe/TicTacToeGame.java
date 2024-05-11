package ticTacToe;

public class TicTacToeGame {
    public static void main(String[] args) {
        String combShapedPattern = "+--+--+--+\n|  |  |  |\n";
        String bottomLinePattern = "+--+--+--+";

        // Print the comb pattern three times
        for (int i = 0; i < 3; i++) {
            System.out.print(combShapedPattern);
        }

        // Print the bottom line
        System.out.println(bottomLinePattern);
    }
}
