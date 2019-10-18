package chap6;

public interface Game {

    public static final int level = 3;

    public void start();

    public void pause();

    public void toContinue();

    public void stop();

    public void play();
}

abstract class TicTacToeAbst implements Game {

    @Override
    public void start() {
        System.out.println("Tic tac toe : start()");
    }

    @Override
    public void pause() {
        System.out.println("Tic tac toe : pause()");
    }

    @Override
    public void play() {
        System.out.println("Tic tac toe : play()");
    }

}
class TicTacToe extends TicTacToeAbst{

    @Override
    public void toContinue() {
        System.out.println("Tic tac toe : toContinue()");
    }

    @Override
    public void stop() {
        System.out.println("Tic tac toe : stop()");
    }
    
}