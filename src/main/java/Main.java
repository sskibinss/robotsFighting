public class Main {
    public static void main(String[] args) {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("RoastedCarrot");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s attacked robot %s, %s is under attack, %s protected",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
