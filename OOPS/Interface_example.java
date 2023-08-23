public class Interface_example {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
    }
}

interface ChessPlayer{
    default void move(){};
}

class Queen implements ChessPlayer{

    @Override
    public void move() {
        System.out.println("up, down, right , left, diagonal");
    }
}

class Rook implements ChessPlayer{

    @Override
    public void move() {
        System.out.println("up, down, right , left");
    }
}

