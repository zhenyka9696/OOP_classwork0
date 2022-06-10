public class OpponentDemo {
    public static int[][] moves = {{1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}};
    public static void main(String[] args) {
        new PlayerOpponent().printMoves();
    }
}

class PlayerOpponent{
    public void printMoves(){
        for (int i=0; i<OpponentDemo.moves.length; i++)
            System.out.println(
                    OpponentDemo.moves[i][0]+", "+
                            OpponentDemo.moves[i][1]);
    }
} 