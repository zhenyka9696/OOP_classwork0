public class Opponent{
    public static void setMoves(int[][] moves) {
        OpponentDemo.moves = moves;
    }

    private static int[][] moves = {{1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}};

    public static int[][] getMoves() {
        return moves;
    }

    public static void main(String[] args) {
        new PlayerOpponent0().printMoves();
    }
}

class PlayerOpponent0{
    public void printMoves(){
        Opponent.setMoves(new int[][] {{1,2}});

//OpponentDemo.moves[1][0]=0;

        OpponentDemo opponentDemo = new OpponentDemo();
        for (int i=0; i<Opponent.getMoves().length; i++)
            System.out.println(
                    Opponent.getMoves()[i][0]+", "+
                            Opponent.getMoves()[i][1]);
        //var elem = getEventGrid_sf(0,0);
        //var elem = eventGrid[0][0];
    }
}
