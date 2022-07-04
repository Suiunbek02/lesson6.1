public class Main {


    public static void main (String[] args) {

        Boss king = new Boss();

        king.setHealth(500);
        king.setDamage(100);

        System.out.println(king.getHealth() + " " + king.getDamage());

    }
}
