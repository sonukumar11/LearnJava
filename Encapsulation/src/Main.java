public class Main {
    public static void main(String[] args){

        // Working without encapsulation
        Player player = new Player();

        player.name = "Sonu Kumar";
        player.health = 20;
        player.weapon = "Scar L";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health of the player is " + player.health);
        player.health = 200; // Hence need for encapsulation..
        player.loseHealth(11);
        System.out.println("Remaining health of the player is " + player.health);


        // Working with encapsulation
        EnhancedPlayer sonu = new EnhancedPlayer("Sonu Kumar" , 200 , "Scar L");
        System.out.println("Initial Health is " + sonu.healthRemaining());

    }
}
