import java.util.ArrayList;
import java.util.List;

public class OnlineGame extends Thread {
    public static volatile boolean isWinnerFound = false;
    public static List<String> steps = new ArrayList<String>();

    static{
        steps.add("Game started");
        steps.add("Resource gathering");
        steps.add("Economic growth");
        steps.add("Killing enemies");
    }

    protected Gamer gamer1 = new Gamer(" Ivanov ", 3);
    protected Gamer gamer2 = new Gamer(" Maksimov ", 2);
    protected Gamer gamer3 = new Gamer(" Sidorov ", 1);

    public void run(){
        gamer1.start();
        gamer2.start();
        gamer3.start();

        while (!isWinnerFound){
        }
        gamer1.interrupt();
        gamer2.interrupt();
        gamer3.interrupt();
    }
}
