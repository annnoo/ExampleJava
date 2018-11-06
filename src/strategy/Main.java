package strategy;

public class Main {

    public static void main(String args[]){
        Player p1 = new Player(new AttackStrategy());


        Player p2 = new Player(new IStrategy() {
            @Override
            public void execute() {
                System.out.println("Ich bin anonym");
            }
        });


        p2.onEnemy();
        p1.onEnemy();
        p2.onEnemy();



    }
}
