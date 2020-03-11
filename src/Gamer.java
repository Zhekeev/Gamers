public class Gamer extends Thread {
    private int rating;
    public Gamer(String name, int rating){
        super(name);
        this.rating=rating;
    }

    @Override
    public void run() {
        while(!OnlineGame.isWinnerFound){
            try {
                for (int i = 0 ; i < OnlineGame.steps.size();i++){
                    Thread.sleep(1000/rating);
                    System.out.println(getName() + " : " + OnlineGame.steps.get(i));
                }
            }catch (InterruptedException e){
                System.out.println(getName() + " : lose");
            }
            if(!OnlineGame.isWinnerFound){
                OnlineGame.isWinnerFound = true;
                System.out.println(getName() + " : winner");
            }
        }
    }
}
