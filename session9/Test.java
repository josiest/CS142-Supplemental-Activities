public class Test {
    public static void main(String[] args) {
        if (args[0].equalsIgnoreCase("fighter")) {
            Fighter fighter = new Fighter();
            System.out.println(fighter.specialAttack());
        }
        else if (args[0].equalsIgnoreCase("warrior")) {
            Fighter fighter = new Warrior();
            System.out.println(fighter.specialAttack());
        }
    }
}
